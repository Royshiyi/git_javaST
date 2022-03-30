package day20210922;

public class Dog extends Animal{
    public Dog(String name, String gender, int age) {
        super(name, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(name + "吃骨头");
    }

    public void bark(){
        System.out.println(name + "汪汪汪~~~~");
    }
}
