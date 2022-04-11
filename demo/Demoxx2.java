package demo;

import java.util.Scanner;
public class Demoxx2 {
    public static void main(String[] args){
        /*
        数据：a,b,c,d,e,f
            ax + by = e
            cx + dy = f
            x = (ed - bf)/(ad - bc)
            y = (af - ec)/(ad - bc)
            delt = ad - bc
        */
        //1.提示用户输入a,b,c,d,e,f
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a,b,c,d,e,f:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        //2.计算x,y,delt
        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);
        double delt = a * b - b * c;
        //3.判断条件,输出结果
        if (delt != 0){
            System.out.println("x is" + x + "and y is" + y);
        } else {
            System.out.println("The equation has no solution");
        }
    }
}
