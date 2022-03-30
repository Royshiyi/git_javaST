package day20210912;

public class OutterClass {

    //成员内部类：普通内部类+静态内部类
    //内部类：普通内部类
    class InnerClass1{

    }
    //静态内部类
    static class InnerClass2{

    }
/*
* 在一个方法的内部也可以定义一个内部类
* */
    //内部类：局部内部类
    //实例代码块
    {
        System.out.println("hello");
        class InnerClass3{

        }
    }
    //静态代码块
    static{
        System.out.println("hello");
        class InnerClass4{

        }
    }

    public void method(){
        class InnerClass5{

        }
        //普通代码块
        {
            class InnerClass6{

            }
        }
    }
    public static void main(String[] args) {

    }
}
