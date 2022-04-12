package day20210915;

public class FinalTest {

    final String gender = "公";
    public static void main(String[] args) {
        int a = 10;
        a = 20;

        final int b = 10;
        /*b = 20;*/         //b被final修饰，认为b是一个常量

        //final 在此处修饰的是array，表明该引用不能去引用其他数组
        final int[] array = new int[10];

        //array = new int[20];
        array[0] = 100;

    }
}
