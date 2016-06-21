package com.springinaction.springidol;

/**
 * 读心者
 * Created by liudebin@99114.com on 2016/6/21.
 */
public class Magician implements MindReader {
    private String thoughts;
    @Override
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer's thoughts.");
        this.thoughts = thoughts;
    }

    @Override
    public String getThoughts() {
        return thoughts;
    }
}
