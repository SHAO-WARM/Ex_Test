package com.stx.p1.ShaoYingzhen;

import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        while (true) {
            System.out.println("请输入数字：");
            int day = num.nextInt();
            switch (day) {
                case 0:
                    System.out.println("今天是星期1");
                    break;
                case 1:
                    System.out.println("今天是星期2");
                    break;
                case 2:
                    System.out.println("今天是星期3");
                    break;
                case 3:
                    System.out.println("今天是星期4");
                    break;
                case 4:
                    System.out.println("今天是星期5");
                    break;
                case 5:
                    System.out.println("今天是星期6");
                    break;
                case 6:
                    System.out.println("今天是周末");
                    break;
                default:
                    System.out.println("输入错误，请重新输入：");
            }
        }
    }
}