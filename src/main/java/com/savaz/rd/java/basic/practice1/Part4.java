package com.savaz.rd.java.basic.practice1;

public class Part4 {

    public static void main(String[] args) {
        if (args.length == 2) {
            try {
                int a = Integer.parseInt(args[0].trim());
                int b = Integer.parseInt(args[1].trim());
                System.out.print(greatestCommonDivisor(a, b));
            } catch (NumberFormatException e) {
                System.out.println("Incorrect input!!");
            }
        }
    }

    public static int greatestCommonDivisor(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }

}
