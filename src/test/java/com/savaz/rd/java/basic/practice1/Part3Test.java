package com.savaz.rd.java.basic.practice1;


import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Part3Test{

    @Test
    public void shouldNotHaveSpaceAtTheEnd() {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream myStream = new PrintStream(outputStream);
        System.setOut(myStream);
        Part3.main(new String[]{"123", "dfbdf", "54541", " sdvnfav", "sdfv54"});
        String s = outputStream.toString();
        Assert.assertEquals("123 dfbdf 54541 sdvnfav sdfv54", s);
        System.setOut(consoleStream);


    }
}