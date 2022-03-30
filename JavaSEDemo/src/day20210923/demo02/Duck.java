package day20210923.demo02;

public class Duck extends Animal implements IRunning,ISwimming,IFlying{

    public Duck(String name, int age) {
        super(name, age);
    }


    @Override
    void eat() {
        System.out.println(name + "吃菠菜");
    }

    @Override
    public void fly() {
        System.out.println(name + "扑棱扑棱");
    }

    @Override
    public void run() {
        System.out.println(name + "鸭子跑");
    }

    @Override
    public void swim() {
        System.out.println(name + "在水上漂");
    }


}
