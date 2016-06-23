package com.springinaction.springidol;

/**
 * Created by liudebin@99114.com on 2016/6/23.
 */
public class CriticismEngineImpl implements CriticismEngine {
    private String[] criticismPool;
    public CriticismEngineImpl() {
    }
    @Override
    public String getCriticism(){
        int i = (int) (Math.random()*criticismPool.length);
        return criticismPool[i];
    }

    public void setCriticismPool(String[] criticismPool) {
        this.criticismPool = criticismPool;
    }
}
