package com.savaz.rd.java.basic.practice1;

public class Part6 {

    public static void main(String[] args) {
        int n;
        int[] mas;
        StringBuilder stringBuilder = new StringBuilder();
        if (args.length == 1) {
            try {
                n = Integer.parseInt(args[0]);
                if (n > 0) {
                    mas = fillArray(n);
                    for (int i : mas) {
                        stringBuilder.append(i).append(" ");
                    }
                    String s = stringBuilder.toString().trim();
                    System.out.print(s);
                }
            } catch (NumberFormatException e) {
                System.out.println("Incorrect input!!");
            }
        }


    }

    public static int[] fillArray(int a) {
        int[] mas = new int[a];
        boolean[] simpleNumbers = booleanArraySimpleNumbers(a);
        int j = 2;
        for (int i = 0; i < mas.length; i++) {
            while (j < simpleNumbers.length) {
                if (simpleNumbers[j]) {
                    mas[i] = j;
                    j++;
                    break;
                }
                j++;
            }
        }
        return mas;
    }

    public static boolean[] booleanArraySimpleNumbers(int n) {
        n = Math.abs(n) + 10;
        boolean[] mas = new boolean[n * n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = true;
        }
        mas[0] = false;
        mas[1] = false;
        for (int i = 2; i < mas.length; i++) {
            if (mas[i]) {
                for (int j = i; j * i < mas.length; j++) {
                    mas[i * j] = false;
                }
            }
        }
        return mas;
    }

}
