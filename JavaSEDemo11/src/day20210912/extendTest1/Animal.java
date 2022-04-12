package day20210912.extendTest1;

public class Animal {
    String name;
    String color;
    String gender;
    int age;

    /*public Animal(String name, String color, String gender, int age) {
        this.name = name;
        this.color = color;
        this.gender = gender;
        this.age = age;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sleep(){
        System.out.println(name +"睡觉");
    }

    public void eat(){
        System.out.println(name + "吃东西");
    }
}
