package day20210912.extendTest1;

public class TestAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "小七";
        dog.color = "金黄色";
        dog.gender = "公";
        dog.age = 1;

        dog.eat();
        dog.sleep();
        dog.bark();

        System.out.println("========================");
        Cat cat = new Cat();
        cat.name = "元宝";
        cat.color = "灰色";
        cat.gender = "男";
        cat.age = 2;
        cat.eat();
        cat.sleep();
        cat.mew();
    }
}
