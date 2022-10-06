package com.stx.p5.ShaoYingzhen;

import java.util.Set;

public class Student {
    private int sid, sage, sscore;
    private String sname, ssex;

    public void setstud(int sid, int sage, int sscore, String sname, String ssex) {
        this.sid = sid;
        this.ssex = ssex;
        this.sname = sname;
        this.sage = sage;
        this.sscore = sscore;
    }

    void show() {
        System.out.println("我叫：" + sname + "学号是：" + sid + ",性别；" + ssex + "," + sage);
        if (sscore < 60) {
            System.out.println("成绩等级为c");
        } else if (60 <= sscore && sscore < 80) {
            System.out.println("成绩等级为b");
        } else if (sscore >= 80) {
            System.out.println("成绩等级为a");
        } else {
            System.out.println("error");
        }
    }
}
