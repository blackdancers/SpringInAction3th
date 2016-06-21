package com.springinaction.springidol;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by liudebin@99114.com on 2016/6/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"spring-pointcut-around-args.xml"})
public class MindReaderTest {
    @Autowired
    MindReader magician;
    @Autowired
    Thinker volunter;

    @Test
    public void magicianShouldReadVolunteersMind() {
        volunter.thinkOfSomething("Queen of Hearts");
        Assert.assertEquals("Queen of Hearts", magician.getThoughts());
    }
}
