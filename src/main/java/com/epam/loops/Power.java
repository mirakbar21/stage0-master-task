package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int intpower = 1;
        for (int i = 1; i <= power; i++) {
            intpower *= numberToPrint;
        }
        System.out.println(intpower);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
