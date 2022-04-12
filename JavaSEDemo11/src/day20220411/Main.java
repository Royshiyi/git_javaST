package day20220411;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        // 循环输入
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            // 获取一行单词
            String s = sc.nextLine();
            // 1. 找到最后一个空格
            // 2. 获取最后一个单词：从最后一个空格+1 位置开始，一直截取到末尾
            // 3. 打印最后一个单词长度
            int len = s.substring(s.lastIndexOf(' ')+1, s.length()).length();
            System.out.println(len);
        }
        sc.close();
    }

}
