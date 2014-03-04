package com.github.jinkerry;

import org.testng.annotations.*;

/**
 * User: jinfeng
 * Date: 14-3-4
 * Time: 上午10:21
 */
public class MethodSequence {
    private static int order = 1;

    @BeforeTest
    private void beforeTest(){
       sayMe("It is @BeforeTest, the order is: ");
    }

    @BeforeMethod
    private void beforeMethod(){
        sayMe("It is @BeforeMethod, the order is: ");
    }

    @BeforeClass
    private void beforeClass(){
        sayMe("It is @BeforeClass, the order is: ");
    }

    @BeforeGroups
    private void beforeGroups(){
        sayMe("It is @BeforeGroups, the order is: ");
    }

    @AfterClass
    private void afterClass(){
        sayMe("It is @AfterClass, the order is: ");
    }

    @AfterMethod
    private void afterMethod(){
        sayMe("It is @AfterMethod, the order is: ");
    }

    @AfterTest
    private void afterTest(){
        sayMe("It is @AfterTest, the order is: ");
    }

    @AfterGroups
    private void afterGroups(){
        sayMe("It is @AfterGroups, the order is: ");
    }

    @Test
    public void test(){
        sayMe("It is @Test, the order is: ");
    }

    private static void sayMe(String words){
        System.out.println(words + order++);
    }

}
