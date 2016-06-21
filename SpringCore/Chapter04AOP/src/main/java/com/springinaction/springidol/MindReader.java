package com.springinaction.springidol;

/**
 *
 * Created by liudebin@99114.com on 2016/6/21.
 */
public interface MindReader {
    /**
     * 监听内心感想
     * @param thoughts
     */
    void interceptThoughts(String thoughts);

    /**
     * 在想什么
     * @return
     */
    String getThoughts();
}
