package day20210922;

public class Cat extends Animal{
    public Cat(String name, String gender, int age) {
        super(name, gender, age);

    }

    @Override
    public void eat() {
        System.out.println(name + "吃鱼");
    }

    public void mew(){
        System.out.println(name + "喵喵喵~~~~");
    }
}

