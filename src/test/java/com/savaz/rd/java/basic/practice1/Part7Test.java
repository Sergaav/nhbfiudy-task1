package com.savaz.rd.java.basic.practice1;

import org.junit.Assert;
import org.junit.Test;


public class Part7Test {



    @Test
    public void str2int() {
        int result = Part7.str2int("AAZ");
        Assert.assertEquals(728, result);
    }

    @Test
    public void int2str() {
        String result = Part7.int2str(728);
        Assert.assertEquals("AAZ", result);
    }

    @Test
    public void rightColumn() {
        String result = Part7.rightColumn("AAZ");
        Assert.assertEquals("ABA",result);
    }
}