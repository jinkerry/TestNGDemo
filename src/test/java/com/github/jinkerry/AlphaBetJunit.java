package com.github.jinkerry;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * Created by jinfeng
 * Created at 15/10/10
 * JUnit run test by hashcode, and by alphabet from v4.12 by MethodSorters
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AlphaBetJunit {

    @Test
    public void banana(){
        System.out.println("banana");
    }

    @Test
    public void apple(){
        System.out.println("apple");
    }

    @Test
    public void dog(){
        System.out.println("dog");
    }

    @Test
    public void cat(){
        System.out.println("cat");
    }
    

}
