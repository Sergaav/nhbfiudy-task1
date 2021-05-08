package com.savaz.rd.java.basic.practice1;

public class Part5 {

    public static void main(String[] args) {
        if (args.length == 1) {
            try {
                int a = Integer.parseInt(args[0]);
                System.out.print(sumOfDigits(a));
            } catch (NumberFormatException e) {
                System.out.println("Incorrect input!!");
            }
        }
    }

    public static int sumOfDigits(int a) {
        int sum = 0;
        int temp = Math.abs(a);
        while (temp / 10 > 0) {
            sum += temp % 10;
            temp = temp / 10;
        }
        sum += temp;
        return sum;
    }

}
