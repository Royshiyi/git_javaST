package day20210912;

public class TestInnerClass {

    int a;
    int b;
    public void methodA(){

    }
    //成员内部类：普通内部类
    class InnerClass{
        int b;
        void methodB(){
            a = 100;     //======>TestInnerClass.this.a = 100
            methodA();   //======>TestInnerClass.this.methodA();

            b = 200;   //给内部类自己的成员变量赋值
            TestInnerClass.this.b = 300;
        }
    }

    public static void main(String[] args) {

        //普通类：成员使用——————》先构造对象，然后通过对象访问其内部成员
        TestInnerClass ti = new TestInnerClass();
        ti.methodA();


        //如何使用成员内部类————普通内部类
        //只能借助外部类的对象来创建内部类
        InnerClass ic = ti.new InnerClass();
        ic.methodB();
    }
}
