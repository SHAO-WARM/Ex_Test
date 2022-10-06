package item1;

import java.util.Arrays;
import java.util.Scanner;

public class MissileView {
    private Managenent[] missile= new Managenent[0];

    public void menu(){//给出用户操作界面
        Scanner scanner = new Scanner(System.in);
        System.out.println("************************************\n" +
                "************欢迎进入导弹管理系统********\n" +
                "************************************\n" +
                "************请输入编号选择功能**********\n");
        System.out.println("################################\n" +
                "1.新增导弹信息\n" +
                "2.导弹信息展示\n" +
                "3.导弹入库\n" +
                "4.导弹出库\n" +
                "5.废弃过时导弹\n" +
                "0.退出系统\n");
        int i = scanner.nextInt();
        switch (i) {//用户选择操作
            case 0:
                break;
            case 1:
                addMissile();
                break;
            case 2:
                show();
                break;
            case 2:
                warehousing();
                break;
        }
    }
    public void addMissile() {//1.添加导弹
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入导弹型号");
        String model = scanner.nextLine();
        System.out.println("请输入导弹名称");
        String name = scanner.nextLine();
        System.out.println("请输入导弹生产国家");
        String factory = scanner.nextLine();
        System.out.println("请输入导弹入库数量");
        int num = scanner.nextInt();
        System.out.println("请输入导弹射程(KM)");
        int flightshot = scanner.nextInt();
        Managenent missile=new Managenent(name,model,factory,num,flightshot);
        Managenent[] managenents=new Managenent[missile.length+1];
        System.arraycopy(missile, 0, managenents, 0, missile.length);
        managenents[managenents.length-1]=missile;
        missile= managenents;
        Scanner.close;
    }
    public void show(){//2.展示导弹信息
       System.out.println("型号\t\t\t名称\t\t\t国家\t\t\t数量\t\t\t射程（KM）\t\t\t");
       for(int i=0; i<this.missile.length;i++){
           System.out.println(Arrays.toString(missile));
       }
    }
    public void warehousing(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入导弹型号");
        String model = scanner.nextLine();
        System.out.println("请输入导弹入库数量");
        int num = scanner.nextInt();
        for(int i=0; i<missile.length;i++) {
            if(model.equals(missile[i])) {
                int index=-(Arrays.binarySearch(missile, model)-1)
                        missile[index].setNum(num+missile[index].getNum());
                System.out.println("该导弹入库成功\n""导弹型号"+missile[index].getModel()"导弹入库数量"+num"导弹总数量"+missile[index].getNum());
                else
                System.out.println("不存在该型号导弹");
            }
        }
        Scanner.close;
    }
}
