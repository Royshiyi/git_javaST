package day20210923.demo02;

public class Frog extends Animal implements IRunning,ISwimming{
    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    void eat() {
        System.out.println(name + "吃昆虫");
    }

    @Override
    public void run() {
        System.out.println(name + "用两条腿蹦跶");
    }

    @Override
    public void swim() {
        System.out.println(name + "用两条腿蹬");
    }
}
