package com.savaz.rd.java.basic.practice1;

public class Part2 {

    public static void main(String[] args) {
        int sum = 0;
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                try {
                    sum += Integer.parseInt(args[i].trim());
                } catch (NumberFormatException e) {
                    System.out.println("Incorrect input!!!");
                }
            }
            System.out.print(sum);
        }
    }
}
