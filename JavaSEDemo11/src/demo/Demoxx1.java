package demo;

import java.util.*;
public class Demoxx1 {
    public static void main(String[] args) {
        /*
        数据：随机一个两位数彩票(电脑)
            用户输入一个两位数彩票(用户)
            电脑顺序 = 用户顺序  10000
            电脑数字 = 用户数字   3000
            电脑一个数字 = 用户的一个数字  1000
        */

        //1.提示用户输入一个两位数
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int usr = input.nextInt();
        //2.随机产生
        Random random = new Random();
        int com = random.nextInt(100);

        //3.用户和电脑的个位和十位
        int usr1 = usr % 10;
        int usr2 = usr / 10;
        int com1 = com % 10;
        int com2 = com / 10;
        //4.判断条件
        if (usr1 == com1 && usr2 == com2){
            System.out.println("奖金为10000美元");
        } else if (usr1 == com2 && usr2 == com1) {
            System.out.println("奖金为3000美元");
        } else if (usr1 == com1 || usr1 == com2 || usr2 == com1 || usr2 == com2) {
            System.out.println("奖金为1000美元");
        } else {
            System.out.println("没有中奖");
        }
    }
}
