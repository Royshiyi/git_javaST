package day20220410;

public class TestString {
    public void method1(){
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("world");
        String s4 = new String("world");
        System.out.println(s1 == s2); // true
        System.out.println(s3 == s4);
    }

    public static void method2(){
        char[] ch = {'a','b','c'};
        String s1 = new String(ch);


        s1.intern();
        //s1 != s2;
        //s1.value = s2.value

        String s2 = "abc";

        System.out.println(s1 == s2);
    }

    public static void method3(){
        String s1 = "hello";
        s1 += " world";
        System.out.println(s1);//创建了新的对象

    }

    public static void main(String[] args) {
        //method2();
        method3();
    }
}
