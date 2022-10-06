package com.stx.p6.ShaoYingzhen;

public class School {
    String schoolname, scaddress;
    int stu, tea;
    double scarea;
    void setSchool(String schoolname, String scaddress, int stu, int tea, double scarea) {
        this.scaddress = scaddress;
        this.schoolname = schoolname;
        this.scarea = scarea;
        this.stu = stu;
        this.tea = tea;
        System.out.println("学校名称："+schoolname+"\n学校地址："+scaddress+"\n学生人数："+stu+"\n教师人数："+tea+"\n学校占地面积："+scarea);
    }
    public void schoolopen() {
        System.out.println("开学时间为9月1日");
    }

    public void holiday() {
        System.out.println("假期时间为1月12日");
    }
}
