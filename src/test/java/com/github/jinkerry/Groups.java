package com.github.jinkerry;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * User: jinfeng
 * Date: 14-3-4
 * Time: 上午11:02
 */
public class Groups {

    @Test(groups = {"p0"})
    public void group001(){
        Assert.assertTrue(true);

    }

    @Test(groups = {"p1"})
    public void group002(){
        Assert.assertTrue(true);

    }

    @Test(groups = {"p0", "p1"})
    public void group003(){
        Assert.assertTrue(true);

    }
}
