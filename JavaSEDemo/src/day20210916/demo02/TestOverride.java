package day20210916.demo02;

public class TestOverride {
    //override:重写
    //overload:重载
    public static void testFunc(Base b){
        b.method1(10);
        //b.methodStatic();
    }

    public static void main(String[] args) {
        testFunc(new Base());
        testFunc(new Derived());
    }
}
