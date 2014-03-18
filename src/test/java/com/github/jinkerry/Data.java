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

        if(method.getName().contains("one"))
            return new Object[][] {
                    {"oneUser01", "password"},
                    {"oneUser02", "test2014"},

            };
        else
            return new Object[][] {
                    {"twoUser01", "password"},
                    {"towUser02", "test2014"},

            };
    }

    @DataProvider(name = "getUser")
    public static Object[][] getUser() {
        User admin = new User("admin", "admin4pass");
        User guest = new User("guest", "guest");


        return new Object[][]{
                {admin},
                {guest},

        };
    }
}
