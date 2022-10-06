package com.stx.p6.ShaoYingzhen;

public class kindergarten extends School {
   //幼儿班
    String master_name;//园长名称
    int by_num;//保育员人数
    int th_num;//保健医师人数

    void getKindergarten() {
        setSchool("铁御国际", "拉斯提莫斯", 500, 500, 500.5);
        master_name = "张三";
        by_num = 20;
        th_num= 30;
        System.out.println("幼儿园区域监察记录\n园长名称：" + master_name + ",保育员人数:" + by_num + ",保健医师人数:" + th_num);

    }

    public void schoolopen() {
        System.out.println("9.2开学");
    }

    @Override
    public void holiday() {
        System.out.println("12.03放假");
    }
}
