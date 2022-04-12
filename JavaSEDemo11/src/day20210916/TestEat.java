package day20210916;

public class TestEat {
    public static void eat(Animal a){
        a.eat();
    }

    public static void main(String[] args) {
        Dog dog = new Dog("小七","公",1);
        Cat cat = new Cat("元宝","男",2);

        eat(dog);
        eat(cat);
    }
}
