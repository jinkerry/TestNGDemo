package com.github.jinkerry;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


/**
 * User: jinfeng
 * Date: 14-3-4
 * Time: 下午4:11
 */
public class DataProviderTest {

    @Test(dataProvider = "getData", dataProviderClass = Data.class)
    public void insideData(String username, String password){

        User user = new User(username, password);

        Assert.assertEquals(user.getUsername(), username);
        Assert.assertEquals(user.getPassword(), password);

    }

    @DataProvider(name="getData")
    private static Object[][] getData(){

        return new Object[][] {
                {"test01", "password"},
                {"test02", "test2014"},
        };
    }


    @Test(dataProvider = "getData", dataProviderClass = Data.class)
    public void outsideData(String username, String password) {
        User user = new User(username, password);

        Assert.assertEquals(user.getUsername(), username);
        Assert.assertEquals(user.getPassword(), password);

    }

}
