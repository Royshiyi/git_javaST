package day20210923.demo02;

public class Dog extends Animal implements IRunning{
    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    void eat(){
        System.out.println(name + ":吃骨头");
    }

    @Override
    public void run() {
        System.out.println(name + "放开四肢跑");
    }
}
