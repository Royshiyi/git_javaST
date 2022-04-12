package day20210922.demo01;

public abstract class Car extends Animal{
    public Car(String name, String gender, int age) {
        super(name, gender, age);

    }
    //只实现Animal类中的一个抽象方法
    public void eat(){
        System.out.println(name + ":吃鱼");
    }
    //此处没有重写Animal类中eat这个抽象方法，相当于在Cat中也存在一个
    // public abstract void bark();
}
