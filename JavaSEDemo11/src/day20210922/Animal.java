package day20210922;

public class Animal {
    String name;
    String gender;
    int age;

    public Animal(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void eat(){
        System.out.println(name + "吃东西");
    }
}
