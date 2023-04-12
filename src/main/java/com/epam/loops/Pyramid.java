package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength + 1; i++) {
            for (int j = 1; j <= cathetusLength - i + 1; j++) {
                System.out.println(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.println(j);
            }
            for (int j = 2; j <= i + 1; j++) {
                System.out.println(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
