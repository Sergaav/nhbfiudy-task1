package com.epam.rd.java.basic.practice1;

import org.junit.Assert;
import org.junit.Test;

public class Part6Test {

    @Test
    public void shouldGenerateArray (){
        int [] tempArray = Part6.fillArray(10);
        int [] expectedArray = new int[] {2,3,5,7,11,13,17,19,23,29};
        Assert.assertArrayEquals(expectedArray,tempArray);

    }



}