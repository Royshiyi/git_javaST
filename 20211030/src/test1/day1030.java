package test1;

public class day1030 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int ret = a>b?a:b;
        System.out.println(ret);
        System.out.println(a > b ? a : b);

        int avg = (a + b) / 2;
        System.out.println(avg);
        avg = a + ((b - a) >> 1);
        System.out.println(avg);
    }
}
