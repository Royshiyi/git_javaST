package day20210916;

public class Cat extends Animal{

    public Cat(String name, String gender, int age) {
        super(name, gender, age);
    }
    //重写了animal中eat方法
    public void eat(){
        System.out.println(name + "吃鱼");
    }
}
