package com.pzhu.novel.aspect;

import com.pzhu.novel.annotations.ReadLog;
import com.pzhu.novel.message.RabbitSender;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ReadLogAspect {
    private static final String INSERT = "insert";
    private static final String UPDATE = "update";

    private final RabbitSender rabbitSender;

    public ReadLogAspect(RabbitSender rabbitSender) {
        this.rabbitSender = rabbitSender;
    }

    @Pointcut("@annotation(com.pzhu.novel.annotations.ReadLog)")
    public void ReadLog() {
    }


    @Before("ReadLog()")
    public void deBefore(JoinPoint joinPoint) throws Throwable {
        System.out.println("开始收集日志");
    }

    @Around("@annotation(readLog)")
    public Object around(ProceedingJoinPoint pjp, ReadLog readLog) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        System.out.println(authentication.getName());
        Object[] args = pjp.getArgs();
        String type = readLog.type().getType();
        if (StringUtils.equals(UPDATE, type)) {
            rabbitSender.sendReadLogUpdate((String) args[0], username);
        } else {
            rabbitSender.sendReadLogInsert((String) args[0], username);
        }
        try {
            return pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }
}
