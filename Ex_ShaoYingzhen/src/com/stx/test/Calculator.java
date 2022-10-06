package com.stx.test;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入第一个算数");
            double num1 = scanner.nextInt();
            System.out.println("请输入第二个算数");
            double num2 = scanner.nextInt();
            System.out.println("请输入计算方法：\n1.\"+\"\n2.\"-\"\n3.\"*\"\n4.\"/\"");
            int num3 = scanner.nextInt();
            switch (num3) {
                case 1:
                    double result = add(num1, num2);
                    System.out.println("加法结果为" + result);
                    break;
                case 2:
                    double result1 = subtraction(num1, num2);
                    System.out.println("减法结果为" + result1);
                    break;
                case 3:
                    double result2 = multiplication(num1, num2);
                    System.out.println("乘法结果为" + result2);
                    break;
                case 4:
                    double result3 = division(num1, num2);
                    System.out.println("除法结果为" + result3);
                    break;
                default:
                    System.out.println("error");
            }
        }
    }

    public static double add(double num1, double num2) {//加法
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {//减法
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2) {//乘法
        return num1 * num2;
    }

    public static double division(double num1, double num2) {//除法
        return num1 / num2;

    }
}
