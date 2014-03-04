package com.github.jinkerry;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

/**
 * User: jinfeng
 * Date: 14-3-4
 * Time: 下午4:14
 */
public class Data {

    @DataProvider(name="getData")
    public static Object[][] getData(Method method){
        System.out.println(method.getName());
        if(method.getName().indexOf("inside") != -1)
            return new Object[][] {
                    {"inside01", "password"},
                    {"inside02", "test2014"},

            };
        else
            return new Object[][] {
                    {"outside01", "password"},
                    {"outside02", "test2014"},

            };
    }
}
