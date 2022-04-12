package day20210912.extendTest2;

public class Derived extends Base{
    //////////////////////////
    //子类和基类成员变量同名了
    int a;
    byte b;
    /////////////////////////
    public void method1(){
        a = 10;
        b = 20;
        c = 30;
    }
    //Derived类增加了a和b成员之后
    //问题一：现在Derived有将基类中的a和b继承下来吗
    //问题二：如果继承下来，下面的a和b访问的是子类的还是父类的
    //a 和 b 就是从基类继承下来的a和b
    public void method2(){
        a = 10;
        b = 20;
        c = 30;

        //如果在子类方法中想要访问从基类继承下来的同名的成员
        //方式一：调用基类所提供的set方法
        setA(1000);
        //方式二：可以借助super关键字
        super.a = 2000;
        super.b = 3000;


    }


    public static void main(String[] args) {
        Derived d = new Derived();
        d.method2();
        d.a = 100;
        d.b = 110;
        d.c = 120;


    }
}
