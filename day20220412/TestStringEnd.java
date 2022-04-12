package day20220412;

public class TestStringEnd {
    public static void method(){
        /*String s = "hello";
        s += " world";
        System.out.println(s);*/

        String s = "a" + "b";       // 在编译阶段：编译器直接将"a"和"b"两个拼接成"ab"

        System.out.println(s);
    }

    public static void main(String[] args) {
        method();
    }
}
