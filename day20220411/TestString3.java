package day20220411;

public class TestString3 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = sb1;

        // 追加：即尾插-->字符、字符串、整形数字
        sb1.append(' '); // hello
        sb1.append("world"); // hello world
        sb1.append(123); // hello world123
        System.out.println(sb1); // hello world123
        System.out.println(sb1 == sb2); // true

        System.out.println(sb1.charAt(0)); // 获取0号位上的字符 h

        System.out.println(sb1.length()); // 获取字符串的有效长度14
        System.out.println(sb1.capacity()); // 获取底层数组的总大小
        sb1.setCharAt(0, 'H'); // 设置任意位置的字符 Hello world123

        sb1.insert(0, "Hello world!!!"); // Hello world!!!Hello world123
        System.out.println(sb1);

        System.out.println(sb1.indexOf("Hello")); // 获取Hello第一次出现的位置
        System.out.println(sb1.lastIndexOf("hello")); // 获取hello最后一次出现的位置
        sb1.deleteCharAt(0); // 删除首字符
        sb1.delete(0,5); // 删除[0, 5)范围内的字符
        String str = sb1.substring(0, 5); // 截取[0, 5)区间中的字符以String的方式返回
        System.out.println(str);

        sb1.reverse(); // 字符串逆转
        str = sb1.toString(); // 将StringBuffer以String的方式返回
        System.out.println(str);
    }
}
