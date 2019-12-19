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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ReadLogLogAspect {
    private static final String INSERT = "insert";
    private static final String UPDATE = "update";

    @Autowired
    private RabbitSender rabbitSender;

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
        //获取注解里的值
        System.out.println("--------------------++++++" + readLog.type().getType());


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


//    @Before("ReadLog()")
//    public void deBefore(JoinPoint joinPoint) throws Throwable {
//        // 接收到请求，记录请求内容
//        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        HttpServletRequest request = attributes.getRequest();
//        // 记录下请求内容
//        System.out.println("URL : " + request.getRequestURL().toString());
//        System.out.println("HTTP_METHOD : " + request.getMethod());
//        System.out.println("IP : " + request.getRemoteAddr());
//        System.out.println("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
//        System.out.println("ARGS : " + Arrays.toString(joinPoint.getArgs()));
//
//    }
//
//    @AfterReturning(returning = "ret", pointcut = "ReadLog()")
//    public void doAfterReturning(Object ret) throws Throwable {
//        // 处理完请求，返回内容
//        System.out.println("方法的返回值 : " + ret);
//    }
//
//    //后置异常通知
//    @AfterThrowing("ReadLog()")
//    public void throwss(JoinPoint jp){
//        System.out.println("方法异常时执行.....");
//    }
//
//    //后置最终通知,final增强，不管是抛出异常或者正常退出都会执行
//    @After("ReadLog()")
//    public void after(JoinPoint jp){
//        System.out.println("方法最后执行.....");
//    }
//
//    //环绕通知,环绕增强，相当于MethodInterceptor
//    @Around("ReadLog()")
//    public Object arround(ProceedingJoinPoint pjp) {
//        System.out.println("方法环绕start.....");
//        try {
//            Object o =  pjp.proceed();
//            System.out.println("方法环绕proceed，结果是 :" + o);
//            return o;
//        } catch (Throwable e) {
//            e.printStackTrace();
//            return null;
//        }
//    }

}
