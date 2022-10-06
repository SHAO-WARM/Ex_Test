package com.stx.p6.ShaoYingzhen;

public class Primaryschool extends School{
    //小学
    String master_name;//校长姓名
    int class_num;//班级总数量
    int sc_num;//科目总数量
    void getPrimaryschool(){
        setSchool("铁铁","哈尼莫星",45550,1800,12000.5);
        master_name="啊对对对";
        class_num=200;
       sc_num=13;
        System.out.println("1班春游,校长名称："+master_name+",班级总数量:"+class_num+",科目总数量:"+sc_num);

    }
  public   void schoolopen() {
        System.out.println("小学开学时间2022年8月28日");
    }

    public void holiday() {
        System.out.println("小学放假时间2023年1月30");
    }
}
