package demo;

import java.util.Scanner;
public class Demoxx4 {
    public static void main(String[] args) {
        //1.提示用户输入的年月日
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year:");
        int year = input.nextInt();
        System.out.print("Enter month:");
        int m = input.nextInt();
        System.out.print("Enter the day of the month:");
        int q =input.nextInt();
        //2.判断条件，分别计算m,j,k,h
        if (m == 1 || m == 2) {
            m = m + 12;
            year = year - 1;
        }
        int j = year / 100;
        int k = year % 100;
        int h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
        //3.输出结果
        String[] arr = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
        System.out.println(arr[h]);
    }
}
