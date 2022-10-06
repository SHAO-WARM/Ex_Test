package com.stx.test;

import java.util.Scanner;

public class Dog {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int age = num.nextInt();
        if (age == 1) {
            System.out.println("15");
        }
        if (age == 2) {
            System.out.println("24");
        }
        if (age == 3) {
            System.out.println("29");
        }
        if (age > 3) {
            int age2 = age - 3;
            age2 = 29 + age2 * 5;
            System.out.println(age2);
        }
    }
}
