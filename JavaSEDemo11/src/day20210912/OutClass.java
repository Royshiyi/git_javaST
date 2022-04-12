package day20210912;

/*
* 外部类和内部类共享一个.java的源文件
* 但是各自有各自的字节码文件
* */
public class OutClass {
    //内部类
    class InnerClass{

    }

    public static void main(String[] args) {
        System.out.println("test");
    }
}
