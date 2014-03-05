package com.github.jinkerry;

import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * User: jinfeng
 * Date: 14-3-5
 * Time: 上午11:31
 */
public class Parallel {

    @Test(threadPoolSize = 1, invocationCount = 2, timeOut = 10000)
    public void test1() throws NoSuchMethodException {
        sayMe(this.getClass().getMethod("test1"));


    }

    @Test(threadPoolSize = 1, invocationCount = 2, timeOut = 10000)
    public void test2() throws NoSuchMethodException {
        sayMe(this.getClass().getMethod("test2"));
    }

    @Test()
    public void test3() throws NoSuchMethodException {
        sayMe(this.getClass().getMethod("test3"));
    }

    @Test()
    public void test4() throws NoSuchMethodException {
        sayMe(this.getClass().getMethod("test4"));
    }


    private static synchronized void sayMe(Method method){
        Thread thread = Thread.currentThread();
        System.out.println("Method: " + method.getName());
        System.out.println("Thread Id: " + thread.getId());
    }

}
