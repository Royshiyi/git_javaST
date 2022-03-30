package day20210923.demo02;

public abstract class Animal {
    protected String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void eat();
    //注意：此处最好不要将run（）方法设置为Animal中的抽象方法
    //并不是所有动物都能跑
    //可以将其设置为接口
    //abstract void run();

    /*abstract void swim();*/
}
