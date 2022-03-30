package day20210922.demo01;

public abstract class Animal {      //抽象类

    protected String name;
    protected String gender;
    protected int age;

    public Animal(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    /*public abstract void eat();         //抽象方法
    abstract public void bark();        //抽象方法
*/
    //抽象方法：必须要在子类中被重写:因此不能是private的
    /*private abstract void drink();*/

    /*public void eat(){
        System.out.println(name + "吃东西");
    }*/
    //   public 是可以省略的，抽象方法默认就是public的
    abstract void eat();
    abstract void bark();//用bark()并不具体
    //如何解决：抽象类

    public static void main(String[] args) {
        /*Animal a = new Animal();*/    //抽象类不能实例化对象，因为抽象类不具体

    }


}
