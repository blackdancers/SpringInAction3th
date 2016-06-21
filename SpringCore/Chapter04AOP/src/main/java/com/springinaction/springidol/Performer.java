package com.springinaction.springidol;
/**
 * n. 演出者；执行者；演奏者
 * 在springidol选秀中，我们将遇到一些竞争者，它们都实现了Performer接口。
 * Created by dujiang on 2016/4/21.
 */
public interface Performer {
    void perform() throws PerformanceExecption;
}
