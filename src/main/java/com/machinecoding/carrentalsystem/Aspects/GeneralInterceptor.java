package com.machinecoding.carrentalsystem.Aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class GeneralInterceptor {
    @Pointcut("execution(* com.machinecoding.carrentalsystem.controller.*.*(..))")
    private void serviceMethods(){}

//    @Before("serviceMethods()")
//    public void beforeMethodExecution(JoinPoint joinPoint){
//        System.out.println("Before method execution...");
//        System.out.println(Arrays.toString(joinPoint.getArgs()));
//    }
//
//    @After("serviceMethods()")
//    public void afterMethodExecution(JoinPoint joinPoint){
//        System.out.println("After method execution...");
//        System.out.println(joinPoint.getSignature());
//    }

    @Around("this(com.machinecoding.carrentalsystem.controller.CarController)")
    public Object aroundExecution(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Before Execution ");
        Object resultObject = proceedingJoinPoint.proceed();
        System.out.println("After Execution "+resultObject);

        return resultObject;
    }


}
