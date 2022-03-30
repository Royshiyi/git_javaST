package PingMian;
import java.util.Scanner;
//矩形和平行四边形的计算：
interface Perimeter{ //定义周长接口
    void Perimeter();  //接口中的方法如果没有访问修饰符修饰，则默认是public类型
}
interface area{ //定义面积接口
    public void area();
}
public abstract class Shape {
    public static void main(String[] args) {                //
        Scanner scan=new Scanner(System.in);

        Rectangle rect = new Rectangle(1, 1);        //创建矩形对象并将长和宽设置为1
        rect.Perimeter();
        rect.area();
        //创建平行四边形对象并设置底边，侧边，高
        Rhomboid rhom = new Rhomboid(3,2,1.5);
        rhom.Perimeter();
        rhom.area();


        System.out.println("请输入圆的半径：");
        double radius = scan.nextDouble();
        Circle c=new Circle(radius);
        System.out.println("圆的周长是："+c.getPerimeter()+",面积是："+c.getArea());

        }
//圆的计算：
        static final float PI=3.14F;
        public abstract double getPerimeter();
        public abstract double getArea();


}

