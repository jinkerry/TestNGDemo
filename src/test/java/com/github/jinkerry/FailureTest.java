package com.github.jinkerry;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * User: jinfeng
 * Date: 14-3-5
 * Time: 下午6:16
 */
public class FailureTest {

    private int result = 0;

    @Test
    public void testSuccess(){
        Assert.assertEquals(1, 1);
    }

    @Test
    public void testRock(){
        Assert.assertEquals(result, 1);
    }

    @Test
    public void testRoll(){
        Assert.assertEquals(result, 1);
    }
}
