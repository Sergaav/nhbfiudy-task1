package com.epam.rd.java.basic.practice1;

public class Part7 {

    public static final String STRING = " ==> ";

    public static void main(String[] args) {
        System.out.println(int2str(1)+ STRING + str2int("A")+ STRING + int2str(1));
        System.out.println(int2str(2)+ STRING + str2int("B")+ STRING + int2str(2));
        System.out.println(int2str(26)+ STRING + str2int("Z")+ STRING + int2str(26));
        System.out.println(int2str(27)+ STRING + str2int("AA")+ STRING + int2str(27));
        System.out.println(int2str(52)+ STRING + str2int("AZ")+ STRING + int2str(52));
        System.out.println(int2str(53)+ STRING + str2int("BA")+ STRING + int2str(53));
        System.out.println(int2str(702)+ STRING + str2int("ZZ")+ STRING + int2str(702));
        System.out.println(int2str(703)+ STRING + str2int("AAA")+ STRING + int2str(703));


    }

    public static int str2int(String number) {
        int result = 0;
        int temp = 0;
        if (number.matches("[{A-Z}]+?")) {
            char[] masChars = number.toCharArray();
            for (int i = 0; i < masChars.length; i++) {
                if (i < masChars.length - 1) {
                    int a = ((int) masChars[i] - 64) + temp;
                    temp = a * 26;
                }
            }
            result = (int) masChars[masChars.length - 1] - 64 + temp;
        }

        return result;
    }

    public static String int2str(int number) {
        int temp;
        StringBuilder string = new StringBuilder();
        while (number != 0) {
            temp = number % 26;
            number = number / 26;
            if (temp != 0) {
                temp += 64;
            } else {
                temp += 90;
                number-=1;
            }
            string.append((char) temp);
        }
        string.reverse();
        return string.toString();
    }

    public static String rightColumn(String number) {
        int givenColumn = str2int(number);
        return int2str(givenColumn+1);
    }
}


