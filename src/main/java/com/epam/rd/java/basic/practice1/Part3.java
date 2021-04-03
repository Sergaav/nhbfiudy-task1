package com.epam.rd.java.basic.practice1;

public class Part3 {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();

        if (args.length > 0) {
            for (String s : args) {
                stringBuilder.append(s.trim()).append(" ");
            }
            System.out.print(stringBuilder.toString().trim());
        }
    }
}
