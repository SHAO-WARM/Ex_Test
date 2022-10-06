package com.stx.p6.ShaoYingzhen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("请输入信息：");
            String scan = scanner.nextLine();

            switch (scan) {
              case "kindergarten" -> {
                kindergarten kind = new kindergarten();
                kind.getKindergarten();
                kind.schoolopen();
                kind.holiday();
            }
            case "Primaryschool" -> {
                Primaryschool psc = new Primaryschool();
                psc.getPrimaryschool();
                psc.schoolopen();
                psc.holiday();
            }

            case "College" -> {
                College col = new College();
                col.getCollege();
                col.Test();
                col.schoolopen();
                col.holiday();
            }
            default -> System.out.println("error");
        }
    }

       /* if (scan.equals("kindergarten")) {
            kindergarten kind = new kindergarten();
            kind.getKindergarten();
            kind.schoolopen();
            kind.holiday();
        } else if (scan.equals( "Primaryschool")) {
            Primaryschool psc = new Primaryschool();
            psc.getPrimaryschool();
            psc.schoolopen();
            psc.holiday();
        } else if (scan.equals( "College")) {
            College col = new College();
            col.getCollege();
            col.Test();
            col.schoolopen();
            col.holiday();
        } else {
            System.out.println("error");
        }*/
    }
}
