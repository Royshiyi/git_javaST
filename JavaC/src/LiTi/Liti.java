package LiTi;

import java.util.Scanner;

//设置里立体图形的接口，
interface Yuanzhui {
    double area();
    double volume();
}
interface Yuanzhu {
    double area();
    double volume();
}

public class Liti {
    public static void main(String[] args) {
        //圆柱体分部测试：
        /*Scanner in=new Scanner(System.in);
        Cylinder cylinder=new Cylinder();
        System.out.println("请输入圆柱体的底面半径r和h：");
        cylinder.SetCylinder(in.nextDouble(),in.nextDouble());
        System.out.println(String.format("%.2f",cylinder.area()));
        System.out.println(String.format("%.2f",cylinder.volume()));
        */
        //圆锥分部测试程序：
        /*Scanner in=new Scanner(System.in);
        Cone cone=new Cone();
        System.out.println("请输入圆锥体的r和h：");
        cone.SetCone(in.nextDouble(),in.nextDouble());
        System.out.println(String.format("%.2f",cone.area()));
        System.out.println(String.format("%.2f",cone.volume()));

         */
    }
}