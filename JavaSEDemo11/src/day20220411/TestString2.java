package day20220411;

public class TestString2 {

    public static void method(){
        StringBuilder sb = new StringBuilder();
        sb.append(100);
        sb.append(12.34);
        sb.append(true);
        sb.append("hello");

        System.out.println(sb.length());   //17      //字符串长度
        System.out.println(sb.capacity()); //34      //获取底层保存字符串空间总的大小
        sb.ensureCapacity(100);       //扩容至100
        System.out.println(sb.capacity());

        sb.toString();
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        /*System.out.println(sb.charAt(100));//越界*/


        sb.setCharAt(0,'A');
        System.out.println(sb.indexOf("hello"));
        sb.append("12.34");
        int offset = sb.indexOf("12.34");
        System.out.println(sb.indexOf("12.34",offset+1));

    }

    public static void main(String[] args) {
        method();
    }
}
