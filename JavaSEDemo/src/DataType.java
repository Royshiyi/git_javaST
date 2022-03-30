import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class DataType {
    public static void main8(String[] args) {
        String s1 = "hello";
        String s2 = "1234";
        System.out.println(s1);
        System.out.println(s2);

        String s3 = "world!!!";
        s1 = s1 + s2;
        System.out.println(s1);

        int a = 1234;
        //需求:将a 转化成字符串类型
        String s4 = "" + a;  //空字符串""
        System.out.println(s4);

        String s5 = String.valueOf(a);
        System.out.println(s5);

        //需求:将数字类型字符串转化为整型数字
        int b = Integer.parseInt(s2);
        System.out.println(s5);

    }

    public static void main7(String[] args) {
        //类型提升
        byte b1 = 10;
        byte b2 = 20;

        int ret1 = b1 + b2;
        System.out.println(ret1);
        //报错:从inte到byte会有数据的丢失
        //原因:在做加法是,b1 b2被提升为int类型了(byte+byte---->int+int---->int)
        byte ret2 = (byte)(b1 +b2);
        System.out.println(ret2);

        byte ret3 = 10 + 20;
        System.out.println(ret3);
    }

    public static void main6(String[] args) {
        //显式类型转换
        byte b = 12;
        int c = 100;
        b = (byte)c;
        System.out.println(c);

        float f = 12.34f;
        double d = 12.35;
        f = (float)d;
        System.out.println(d);
    }

    public static void main5(String[] args) {
        //隐式类型转换
        byte b = 12;
        int c = 100;
        c = b;
        System.out.println(c);

        float f = 12.34f;
        double d = 12.35;
        d = f;
        System.out.println(d);



    }

    public static void main4(String[] args) {
        char ch1 = 'A';
        char ch2 = '1';
        char ch3 = '帅';
        //char ch4 = '帅气';
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);

        System.out.println("=================");
        System.out.println("char的取值范围:");
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);

    }
    public static void main3(String[] args) {
        double  d = 1.1;
        System.out.println(d*d);
        System.out.printf("%f\n",d*d);

        int r = 1;
        int e = 2;
        System.out.println(r/e);
        //int类型

        //基本数据类型(四类八种):
        //整型:Byte short int long
        //浮点型:float double(小数默认情况下是double类型)
        //字符型:char
        //布尔类型:boolean(标准没有规定,hotspot -jvm占1个字节)true false
        int a = 100;
        short b = 200;
        Byte c = 127;
        //b = c;
        b = 100;

        double d1 = 12.34;
        //float d2 = 12.35;
        float d2 = 12.35f;
        System.out.println(d1);
        System.out.println(d2);

        System.out.println("=================");
        System.out.println("double的取值范围:");
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        System.out.println("=================");
        System.out.println("Float的取值范围:");
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);



    }

    public static void main2(String[] args) {
        System.out.println("DataType");
    }

    public static void main1(String[] args){
        System.out.println("hello world!!!");
    }
}
