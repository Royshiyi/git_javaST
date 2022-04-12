package demo;

import java.util.Scanner;
public class Demoxx5 {
    public static void main(String[] args) {
        //1.输入两个矩阵的高，宽
        Scanner input = new Scanner(System.in);
        System.out.print("Enter r1:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double w1 = input.nextDouble();
        double h1 = input.nextDouble();
        System.out.print("Enter r2:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double w2 = input.nextDouble();
        double h2 = input.nextDouble();
        //2.判断条件，输出结果
        if (y2 - y1 <= (h1 - h2) / 2 || y1 - y2 <= (h1 - h2) / 2 || x2 - x1 <= (w1 - w2) / 2 || x1 - x2 <= (w1 - w2) / 2) {
            System.out.println("r2 is in r1");
        } else if ( y2 - y1 >= (h1 + h2) / 2 && y1 - y2 >= (h1 + h2) / 2 && x2 - x1 >= (w1 + w2) / 2 && x1 - x2 >= (w1 + w2) / 2){
            System.out.println("r2 is not in r1");
        } else {
            System.out.println("r2 overlaps r1");
        }
    }
}