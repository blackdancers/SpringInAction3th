package com.springinaction.springidol;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 观众
 * Created by dancer on 2016/6/19.
 */
public class Audience {
    /**
     * 环绕通知
     * @param joinPoint
     */
    public void watchPerformance(ProceedingJoinPoint joinPoint){
        System.out.println("The audience is taking their seats.");
        System.out.println("The audience is turning off their cellphonesWWW.");
        long start = System.currentTimeMillis();
        try {
            joinPoint.proceed();
            long end = System.currentTimeMillis();
            System.out.println("CLAP CLAP CLAP CLAP CLAP CLAP ");
            System.out.println("The performance took "+(end-start)+"milliseconds.");
        } catch (Throwable throwable) {
            System.out.println("Boo! We want our money back!");
        }
    }

    public void takeSeats(){
        //表演之前
        System.out.println("The audience is taking their seats");
    }
    public void turnOffCellPhones(){
        System.out.println("The audience is turning off their cellphone");
    }
    public void applaud(){
        //表演之后
        System.out.println("CLAP CLAP CLAP CLAP CLAP CLAP ");
    }
    public void demandRefund(){
        System.out.println("Boo! we want our money back");
    }
}





















