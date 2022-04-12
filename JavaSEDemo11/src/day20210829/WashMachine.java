package day20210829;

//洗衣机类
public class WashMachine {
    //成员变量----字段----属性（不建议称为属性）
    double length;
    double width;
    double height;
    String color;
    String brand;//品牌
    String type; //种类


    //功能---成员方法----行为
    public void washClothes(){

        System.out.println("洗衣服功能");
    }
    public void dryClothes(){

        System.out.println("烘干功能");
    }
    public void setTime(){
        System.out.println("定时");

    }
    //通知用户
    public void notifyUser(){
        System.out.println("通知");
    }


}








