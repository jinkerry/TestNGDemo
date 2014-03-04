package com.github.jinkerry;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * User: jinfeng
 * Date: 14-3-4
 * Time: 上午9:58
 */
public class HelloTestNG{

    @Test
    public void hi(){
        String hello = "hi";
        HelloNG helloNg = new HelloNG(hello);

        Assert.assertEquals(helloNg.getWords(), hello);
    }

    @Test
    public void hello(){
        String hello = "hi";
        HelloNG helloNg = new HelloNG(hello);

        Assert.assertEquals(helloNg.getWords(), "hello", "oh, no!");
    }

}
