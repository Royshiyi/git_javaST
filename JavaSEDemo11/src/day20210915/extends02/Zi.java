package day20210915.extends02;

public class Zi extends Fu{
    public Zi(){
        System.out.println("我是子类的构造方法");
    }

    //
    {
        System.out.println("我是子类的实例代码块");
    }
    static{
        System.out.println("我是子类的静态代码块");
    }

    public static void main(String[] args) {
        Zi z1 = new Zi();
        System.out.println("=========");
        Zi z2 = new Zi();
    }

}
