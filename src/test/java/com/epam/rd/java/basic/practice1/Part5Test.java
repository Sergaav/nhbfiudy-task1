package com.epam.rd.java.basic.practice1;

import org.junit.Assert;
import org.junit.Test;



public class Part5Test {

    @Test
    public void shouldBeCorrectSum() {
        int sum = Part5.sumOfDigits(123456);
        Assert.assertEquals(21, sum);

    }
}