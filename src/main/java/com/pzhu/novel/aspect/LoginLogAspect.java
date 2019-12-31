package com.pzhu.novel.aspect;

import com.pzhu.novel.mbg.mapper.LoginlogMapper;
import com.pzhu.novel.mbg.model.Loginlog;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Aspect
@Component
public class LoginLogAspect {

    private final LoginlogMapper loginlogMapper;

    public LoginLogAspect(LoginlogMapper loginlogMapper) {
        this.loginlogMapper = loginlogMapper;
    }

    @Pointcut("@annotation(com.pzhu.novel.annotations.LoginLog)")
    public void LoginLog() {
    }


    @Before("LoginLog()")
    public void deBefore(JoinPoint joinPoint) throws Throwable {
        System.out.println("开始收集日志");
    }

    @Around("LoginLog()")
    public Object around(ProceedingJoinPoint pjp) {
        Object proceed = null;
        try {
            proceed = pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        Loginlog loginlog = new Loginlog();
        loginlog.setTime(LocalDateTime.now());
        loginlog.setUsername(username);
        loginlogMapper.insertSelective(loginlog);
        return proceed;
    }
}
