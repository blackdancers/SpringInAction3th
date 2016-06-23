package com.springinaction.springidol;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 观众,使用@Aspect注解标注该类为一个切面
 * Created by dancer on 2016/6/19.
 */
@Aspect
public class Audience {

    @Pointcut("execution(* com.springinaction.springidol.Performer(..)")
    public void performance() {

    }

    @Before("performance()")
    public void takeSeats() {
        //表演之前
        System.out.println("The audience is taking their seats");
    }

    @Before("performance()")
    public void turnOffCellPhones() {
        System.out.println("The audience is turning off their cellphone");
    }

    @AfterReturning("performance()")
    public void applaud() {
        //表演之后
        System.out.println("CLAP CLAP CLAP CLAP CLAP CLAP ");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Boo! we want our money back");
    }

    /**
     * 注解 环绕通知
     *
     * @param joinPoint
     */
    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint) {
        System.out.println("The audience is taking their seats.");
        System.out.println("The audience is turning off their cellphonesWWW.");
        long start = System.currentTimeMillis();
        try {
            joinPoint.proceed();
            long end = System.currentTimeMillis();
            System.out.println("CLAP CLAP CLAP CLAP CLAP CLAP ");
            System.out.println("The performance took " + (end - start) + "milliseconds.");
        } catch (Throwable throwable) {
            System.out.println("Boo! We want our money back!");
        }
    }
}





















