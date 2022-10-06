package com.stx.p3.ShaoYingzhen;

import java.util.Scanner;

public class Class3 {
    public static void main(String[] args) {
        int[] num = {124, 1, 9, 38, 79, 66, 12, 99, 125};
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1; j++) {
                if (num[j] < num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        for (int t = 0; t < num.length; t++) {
            System.out.print(" " + num[t]);
        }
        Scanner x = new Scanner(System.in);
        System.out.println("\n请输入数字");
        int num1 = x.nextInt();
        int k = 0;
        for (int i = 0; i < num.length; i++)
            if (num1 == num[i]) {
                k = 1;
            }
        if (k == 1) {
            System.out.println("存在数字" + num1);
        } else {
            System.out.println("不存在数字" + num1);
        }
    }
}
