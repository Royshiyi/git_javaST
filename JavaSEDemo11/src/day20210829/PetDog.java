package day20210829;

public class PetDog {//类
    //字段
    public String name;
    public String color;

    //方法
    public void wag(){
        System.out.println(name + "摇尾巴");
    }
    public void bark(){
        System.out.println(name + "汪汪汪~~~~~");
    }

    public static void main(String[] args) {
        //petdog是用户自定义的一种新的类型----引用类型
        //dogH:不将其称为变量，更习惯称为对象
        PetDog dogH = new PetDog();   //对象
        dogH.name = "小黄";
        dogH.color = "金黄色";
        dogH.wag();
        dogH.bark();
        //注意：此时wag（）以及bark（）方法不能直接调用
        //必须要通过对象来进行调用
        //wag();
        //bark();


        PetDog dogQ = new PetDog();//实例化了一个PetDog的对象
        dogQ.name = "小七";
        dogQ.color = "黑色";
        dogQ.wag();
        dogQ.bark();
    }
}
