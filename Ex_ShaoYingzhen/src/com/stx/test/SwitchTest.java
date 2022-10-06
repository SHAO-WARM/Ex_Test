package com.stx.test;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的请求：\n1，查询星系\n2，构建环宇宙\n3，查询时间线性论与过去现在未来论");
        int num1 = scanner.nextInt();
        switch (num1) {

            case 1:
                System.out.println("您所在的星系为太阳系");
                break;
            case 2:
                System.out.println("loading........\n环宇宙搭建完毕");
                break;
            case 3:
                System.out.println("error您的权限不足");
                break;
            default:
                System.out.println("error");
        }

    }
}
