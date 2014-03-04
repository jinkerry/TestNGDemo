package com.github.jinkerry;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * User: jinfeng
 * Date: 14-3-4
 * Time: 下午6:01
 */
public class Parameter {

    private String host;
    private String port;

    @Parameters({"host", "port"})
    @BeforeTest()
    private void beforeTest(@Optional String host, @Optional String port) {
        this.host = host;
        this.port = port;
    }

    @Test
    public void parameters() {
        String url = host + ":" + port;
        System.out.println(url);
        Assert.assertEquals(url, "smtp.163.com:25");

    }
}
