package com.epam.rd.java.basic.practice1;


import org.junit.Assert;
import org.junit.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Part2Test {
    @Test
    public void testMain() {

        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream myStream = new PrintStream(outputStream);
        System.setOut(myStream);
        Part2.main(new String[]{"15", "25", "15", "851", "159"});
        int result = Integer.parseInt(outputStream.toString());
        Assert.assertEquals(1065, result);
        System.setOut(consoleStream);
        System.out.println(result);
    }


}