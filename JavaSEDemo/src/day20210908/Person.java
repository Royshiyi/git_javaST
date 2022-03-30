package day20210908;

public class Person {
    int age;

    /*public Person(int age){
        this.age = age;

    }*/

    //还可以让IDEA自动替用户生成
    //alt + insert(ins)
    public Person(int age) {
        System.out.println(this.age);
    }
    public void printPersonInfo(){
        System.out.println(age);
    }

    public static void main(String[] args) {
        //构造方如果用户没有显示实现，编译器会自动生成一份，P二送（）{}
        int a = 10;
        System.out.println(a);

        //在方法体中的局部变量在使用时必须要初始化
        //int b;
        //System.out.println(b);

        Person p = new Person(2021);
        p.printPersonInfo();
    }
}
