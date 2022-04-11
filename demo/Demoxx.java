package demo;

import java.util.Scanner;
public class Demoxx {
    public static void main(String[] args) {
        //数据：体重weight 身高height 身体质量指数BMI = weight / height^2

        //1.提示用户输入体重和身高
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight:");
        double weight = input.nextDouble();
        System.out.println("Enter height:");
        double height = input.nextDouble();

        //2.计算BMI
        double BMI = weight * 0.45359237 / Math.pow( height * 0.0254, 2);

        //3.判断BMI条件,输出结果
        if (BMI < 18.5){
            System.out.println("偏瘦");
        } else if (BMI < 25.0) {
            System.out.println("正常");
        } else if (BMI < 30.0) {
            System.out.println("超重");
        } else {
            System.out.println("过胖");
        }
    }
}
