package com.stx.p6.ShaoYingzhen;

import java.util.Scanner;

public class College extends School{
    //大学

    String master_name;//校长姓名
    int cr_num;//院系总数量
    int teacher_num;//讲师数量

    void getCollege() {
        setSchool("BT7274", "科普斯", 20400, 3040, 502000.5);
        master_name = "啊错错错";
        cr_num = 9;
        teacher_num = 2500;
        System.out.println("校长名称：" + master_name + ",院系总数量:" + cr_num + ",讲师数量:" +teacher_num);

    }

    void Test() {
        System.out.println("请输入成绩：");
        Scanner score = new Scanner(System.in);
        int sc = score.nextInt();
        if (sc >= 500) {
            System.out.println("录取成功!");
        } else {
            System.out.println("未达到录取线!");
        }
    }

    public void schoolopen() {
        System.out.println("大学开学时间：2022年9月7日");
    }

  public   void holiday() {
        System.out.println("大学放假时间：2023年1月20");
    }
}
