package com.savaz.rd.java.basic.practice1;


import org.junit.Assert;
import org.junit.Test;


public class Part4Test {

    @Test
    public void testGreatestCommonDivisor() {
        int result = Part4.greatestCommonDivisor(-18, 30);
        Assert.assertEquals(6, result);

    }
}