package day20210912;

//注意：同一个.java的源文件中可以存在多个类
    //但是这种方式不能称为内部类
    //最多只能有一个由public修饰的类
class Test{

}
public class Demo {
    int a = 10;
    static int b;
    //实例代码块
    {
        a = 10;
        System.out.println("实例代码块1");
    }

    {
        System.out.println("实例代码块2");
    }

    static{
        System.out.println("静态代码块1");
        b = 10;
    }
    static{
        System.out.println("静态代码块2");
    }

    //测试TestInnerClass中内部类的使用
    void func(){
        TestInnerClass ti = new TestInnerClass();

        //要实例化TestInnerClass中内部类的对象
        //InnerClass编译器不能识别——————因为类在TestInnerClass内部定义
        //
        TestInnerClass.InnerClass tii = ti.new InnerClass();
    }
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
    }
}
