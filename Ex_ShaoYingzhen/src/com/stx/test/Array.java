package com.stx.test;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = {"尼", "张", "小王", "大王", "二", "三"};
        System.out.println("请选择你的操作：1.增加数据 2.删除数据3.更改数据4.查找数据");
        int index = scanner.nextInt();
        if (index == 1) {
            arr=add(arr);
            System.out.println(Arrays.toString(arr));
        } else if (index == 2) {
            arr=delete(arr);
            System.out.println(Arrays.toString(arr));
        } else if (index == 3) {
            arr=change(arr);
            System.out.println(Arrays.toString(arr));
        } else if (index == 4) {
            find(arr);
        }
        //String i = Arrays.binarySearch(arr, add);
            /*int index = -(i) - 1;//先找位置，在扩容
            for (int j = 0, l = 0; j < arr2.length; j++) {
                if (j == index) {
                    arr2[j] = add;
                } else {
                    arr2[j] = arr[l];
                    l++;
                }
            }
            arr = arr2;
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "  ");
            }*/

    }

    public static String [] add(String[] arr) {
        System.out.println("请输入要增加的值");
        Scanner scanner = new Scanner(System.in);
        String add1 = scanner.nextLine();
        String[] arr2 = new String[arr.length + 1];
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        arr2[arr.length] = add1;
        arr = arr2;
        scanner.close();
        return arr;
    }

    public static String[] delete(String[] arr) {
        System.out.println("请输入要删除的值");
        Scanner scanner = new Scanner(System.in);
        String delete = scanner.nextLine();
        int i = Arrays.binarySearch(arr, delete);
        int index = -(i) - 1;
        arr[index] ="";
        String[] arr2 = new String[arr.length ];
        System.arraycopy(arr, 0, arr2, 0, arr.length - 1);
        arr = arr2;
        return arr;

    }

    public static String[] change(String[] arr) {
        System.out.println("请输入要改变的值");
        Scanner scanner = new Scanner(System.in);
        String change = scanner.nextLine();
        int i = Arrays.binarySearch(arr, change);
        int index = -(i) - 1;
        System.out.println("你想将该值改变为改变为：");
        String change1 = scanner.nextLine();
        arr[index] = change1;
        return arr;

    }

    public static String find(String[] arr) {
        System.out.println("请输入要查询的值");
        Scanner scanner = new Scanner(System.in);
        String find = scanner.nextLine();
        int i = Arrays.binarySearch(arr, find);
        int index = -(i) - 1;
        return "要查询的值位于" + index + 1;
    }
}
