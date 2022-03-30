package day20210909;

public class Person {
    String name = "1111";
    String gender = "2222";
    int age = 20;

    //就地初始化
    static int count;

    {
        name = "佚名";
        gender = "无";
        age = 0;
        System.out.println("这是实例代码块");
    }

    //静态代码块---用来初始化静态成员变量
    //在类加载时只执行一次，创建对象之前进行调用的
    static{
        System.out.println(count);
        count = 1;
        System.out.println(count);
        System.out.println("我是静态代码块");
    }

    public Person(){
        System.out.println("这是构造方法");
    }

    public Person(int age){
        System.out.println("这是实例代码块Person(int age)");
    }
    /*public Person(String name,String gender,int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }*/

    public void printPersonInfo(){
        System.out.println(this.name + ","+ this.gender+"," +this.age);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person(20);
    }
}
