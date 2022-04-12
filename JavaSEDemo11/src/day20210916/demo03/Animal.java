package day20210916.demo03;

public class Animal {
    protected String name;
    protected String gender;
    protected int age;

    public Animal(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    //实现多态行为
    public void eat(){
        System.out.println("默认吃的方式");
    }


}
