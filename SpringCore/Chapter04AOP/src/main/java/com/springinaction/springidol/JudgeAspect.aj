package com.springinaction.springidol;

/**
 * 表演结束之后发表评论
 * Created by liudebin@99114.com on 2016/6/23.
 */
public aspect JudgeAspect {
    pointcut performance():execution(* perform(..));
    after() returning():performance(){
        System.out.println(criticismEngine.getCriticism());
    }

    private CriticismEngine criticismEngine;
    //setter注入
    public void setCriticismEngine(CriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }
}
