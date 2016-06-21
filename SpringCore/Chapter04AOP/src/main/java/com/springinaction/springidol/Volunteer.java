package com.springinaction.springidol;

/**
 * 志愿者
 * Created by liudebin@99114.com on 2016/6/21.
 */
public class Volunteer implements Thinker {
    private String thoughts;
    @Override
    public void thinkOfSomething(String thoughts) {
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}
