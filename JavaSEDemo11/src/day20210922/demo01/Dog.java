package day20210922.demo01;


//因为Dog实现了Animal抽象类中的所有方法，Dog类就不是抽象类，具体的类，DOG类就可以创建对象
public class Dog extends Animal{
    public Dog(String name, String gender, int age) {
        super(name, gender, age);
    }

    public void eat(){
        System.out.println(name + ":吃骨头");
    }
    public void bark(){
        System.out.println(name + "：汪汪汪~~~");
    }

    public static void main(String[] args) {
        Dog d = new Dog("小七","公",1);

    }

}
