package demo;

import java.util.Scanner;
public class Demoxx3 {
    public static void main(String[] args) {
        //1.提示用户代表数字日期
        String[] arr = {"Sunday", "Monday", "Tuesday", "Wednessday", "Thursday", "Friday","Saturday" };
        Scanner input = new Scanner(System.in);
        //2.提示用户输入当天天数，将来天数
        System.out.print("Enter today's day:");
        int today = input.nextInt();
        System.out.print("Enter future's day:");
        int future = input.nextInt();

        //3.输出结果
        System.out.println("Today is " + arr[today] + " and the future day is " + arr[future]);
    }
}