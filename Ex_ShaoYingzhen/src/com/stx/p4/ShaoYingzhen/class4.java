package com.stx.p4.ShaoYingzhen;

public class class4 {
    public static  void main(String[] args){
        int i=0;
        int j=0;
        String str="want you to know one thing";
        for(int k=0;k<str.length();k++){
            int t=str.indexOf("n",k);
            if(k==t){
                i++;
            }
            int l=str.indexOf("o",k);
            if(k==l){
                j++;
            }
        }
        System.out.println("n出现的次数"+i);
        System.out.println("0出现的次数"+j);
    }
}
