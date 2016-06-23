package com.springinaction.springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by liudebin@99114.com on 2016/6/23.
 */
@Aspect
public class ContestantIntroducer {
    @DeclareParents(value = "com.springinaction.springidol.Performer+", defaultImpl = GraciousContestant.class)
    public static Contestant contestant;
}
