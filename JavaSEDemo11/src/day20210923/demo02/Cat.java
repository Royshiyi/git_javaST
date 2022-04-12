package day20210923.demo02;

public class Cat extends Animal implements IRunning{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void eat() {
        System.out.println(name + "吃鱼");
    }

    @Override
    public void run() {
        System.out.println(name + "无声的跑");
    }
}
