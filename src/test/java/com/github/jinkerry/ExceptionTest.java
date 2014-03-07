package com.github.jinkerry;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * User: jinfeng
 * Date: 14-3-7
 * Time: 下午2:04
 */
public class ExceptionTest {
    private final String msg = "ops, where amazing happens.";

    @Test(expectedExceptions = IOException.class)
    public void exception() throws IOException {
        throw new IOException();
    }

    @Test(expectedExceptions = IOException.class, expectedExceptionsMessageRegExp = msg)
    public void exceptionMsg() throws IOException {
        Assert.assertEquals(1, 1);
        IOException ioe = new IOException(msg);
        System.out.println(ioe.getMessage());
        throw ioe;

    }

    @Test
    public void tryException() {
        FileNotFoundException fe = new FileNotFoundException();
        IOException ioe = new IOException();
        try {
            FileInputStream fis = new FileInputStream("");
            fis.close();
        } catch (FileNotFoundException e) {
            Assert.assertEquals(e.getClass(), fe.getClass());
        } catch (IOException e) {
            Assert.assertEquals(e.getClass(), ioe.getClass());
        }
    }


}
