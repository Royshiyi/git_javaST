package day20210915.extends02;

public class Fu {
    public Fu(){
        System.out.println("我是构造方法");
    }

    //实例代码块
    {
        System.out.println("我是实例代码块");
    }

    static{
        System.out.println("我是静态代码块");
    }
}
