package day20220401;

public class Person implements Cloneable{

    private String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        return (Person)super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("李雷",13);
        Person p2 = p1;
        p2.age = 19;

        System.out.println(p1.age);
        //可以看成是一种拷贝的方式

        Person p3 = p1.clone();
        p3.age = 20;
        System.out.println(p1.age);
        System.out.println(p2.age);
        System.out.println(p3.age);

    }
}
