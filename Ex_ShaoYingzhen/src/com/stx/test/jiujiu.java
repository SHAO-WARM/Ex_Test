package com.stx.test;

public class jiujiu {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            // System.out.println("\n");
            for (int j = 1; j <= i; j++) {
                int sum = i * j;
                System.out.print("" + i + "x" + j + "=" + sum + " \t");
            }
            System.out.println("\n");
        }

    }

}
