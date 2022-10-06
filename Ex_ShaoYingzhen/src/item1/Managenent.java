package item1;

public class Managenent {
    private String name, model, factory;
    private int num, flightshot;//定义相关变量

    public Managenent(String name, String model, String factory, int num, int flightshot) {
        setName(name);
        setModel(model);
        setFactory(factory);
        setNum(num);
        setFlightshot(flightshot);
        System.out.println("添加导弹成功\n导弹型号为：" + this.model + "导弹名称为：" + this.name + "导弹产地为：" + this.factory + "导弹数量为：" + this.num + "导弹射程为：" + this.flightshot + "KM");
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getFactory() {
        return factory;
    }

    public int getNum() {
        return num;
    }

    public int getFlightshot() {
        return flightshot;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public void setFlightshot(int flightshot) {
        this.flightshot = flightshot;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(int num) {
        this.num = num;
    }
    public String toString() {
        return name+"\t\t\t"+model+"\t\t\t"+factory+"\t\t\t"+num+"\t\t\t"+flightshot;

    }
}
