package com.springinaction.springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 读心者
 * Created by liudebin@99114.com on 2016/6/21.
 */
@Aspect
public class Magician implements MindReader {
    private String thoughts;

    @Pointcut("execution(* com.springinaction.springidol.Thinker.thinkOfSomething(String)) && args(thoughts)")
    public void thinking(String thoughts) {
        //声明参数化的切点
    }

    @Override
    @Before("thinking(thoughts)")//把参数传递给通知
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer's thoughts.");
        this.thoughts = thoughts;
    }

    @Override
    public String getThoughts() {
        return thoughts;
    }
}
