package com.github.jinkerry;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * User: jinfeng
 * Date: 14-3-4
 * Time: 上午11:41
 */
public class Depend {

    public boolean isExist() {
        return exist;
    }

    public void setExist(boolean exist) {
        this.exist = exist;
    }

    private boolean exist = false;

    @Test(dependsOnMethods = "newBlog", alwaysRun = true)
    public void comment(){
        Assert.assertEquals(this.isExist(), true);

    }

    @Test(dependsOnMethods = "newBlog")
    public void commentSkip(){
        Assert.assertEquals(this.isExist(), true);

    }

    @Test
    public void newBlog(){
        this.setExist(false);
        Assert.assertEquals(this.isExist(), true);
    }

}
