package day20210912.extendTest4;

public class Zi extends Fu{
    int c;
    int d;

    //如果基类的构造方法是默认的或者是无参的构造方法，子类的构造方法可以不用定义
    //可以需要再定义
    //带有参数则不行，就必须要定义子类构造方法
    /*public Zi(){
        // super(); // 注意子类构造方法中默认会调用基类的无参构造方法：super(),
        // 用户没有写时,编译器会自动添加，而且super()必须是子类构造方法中第一条语句，
        // 并且只能出现一次
        System.out.println("Zi()");
    }*/

    public static void main(String[] args) {
        Zi z = new Zi();
    }
}
