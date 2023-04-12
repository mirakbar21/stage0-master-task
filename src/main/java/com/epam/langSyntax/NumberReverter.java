package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
//        int revertednumber1 = number / 100 + number % 100 / 10 + number % 100 % 10;
        int revnum = number / 100;
        int revnum2 = number % 100 / 10;
        int revnum3 = number % 100 % 10;
        System.out.println(String.valueOf(revnum3) + "" + String.valueOf(revnum2) + "" + String.valueOf(revnum));
    }

}
