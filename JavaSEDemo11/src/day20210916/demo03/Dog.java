package day20210916.demo03;

import day20210916.Animal;

public class Dog extends Animal {
    public Dog(String name, String gender, int age) {
        super(name, gender, age);
    }
    public void bark(){
        System.out.println(name + "汪汪汪~~~");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("小七","公",1);
        dog.getName();
        dog.getGender();
    }

    public void eat(){
        System.out.println(name + "吃骨头");
    }
}
