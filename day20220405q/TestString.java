package day20220405;

public class TestString {
    void method1(){
        String s1 = "hello";
        String s2 = new String("world");

        char[] array = {'h','e','l','l','o','w','o','r','l','d'};
        String s3 = new String(array);

        String s4 = new String();

        final char[] arr1 = {'1','2','3'};
        arr1[0] = 'a';
        /*arr1 = new char[]{'a','b','c'};*/
        //引用改不了
    }

    static void method2(){
        String s1 = "hello";
        String s2 = new String("world");

        s1 = s2;

    }

    static void method3(){
        String s1 = new String("hello");
        String s2 = new String("hello");
        String s3 = new String("world");

        String s4 = s1;
        System.out.println(s1 == s2);//false
        System.out.println(s2 == s3);//false
        System.out.println(s1 == s4);//true

        System.out.println(s1.equals(s1));
        System.out.println(s1.equals(null));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));

        String s5 = "abc";
        String s6 = "Abc";
        System.out.println(s5.compareToIgnoreCase(s6));


    }


    static void method4(){
        String s = "aaabbbcccaaabbbccc";

        System.out.println(s.charAt('a'));
        //从前往后找
        System.out.println(s.indexOf('c'));
        System.out.println(s.indexOf('c',10));
        System.out.println(s.indexOf("aaa"));
        System.out.println(s.indexOf("aaa",5));

        //从后往前找
        System.out.println(s.lastIndexOf('a'));
        System.out.println(s.lastIndexOf('a',10));
        System.out.println(s.lastIndexOf("bbb"));
        System.out.println(s.lastIndexOf("bbb",5));

    }

    static void method5(){
        //数字转化字符串
        String s1 = String.valueOf(1234);
        String s2 = String.valueOf(12.34);

        String s3 = String.valueOf(true);
        /*String s4 = String.valueOf(new Student("HanMeimei",18))*/
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        /*System.out.println(s4);*/

    }

    static void method6(){
        String s1 = "abc";
        String s2 = "ABC";
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());

        String s3 = s1.toUpperCase();
        String s4 = s2.toLowerCase();
        System.out.println("=================");

        char[] arr = s3.toCharArray();

        String s5 = new String(arr);

        String s6 = String.format("%d-%d-%d",2022,04,05);
        System.out.println(s6);


    }

    public static void main(String[] args) {
        //method2();

        //method3();
        //method4();
        //method5();
        method6();
    }



}
