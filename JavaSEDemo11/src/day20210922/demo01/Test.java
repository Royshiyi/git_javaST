package day20210922.demo01;


//普通一个类
public class Test {
    public void func(){
        System.out.println("Test:func()");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.func();
    }
}
