package Test;
//导入Scanner包
import java.util.Scanner;
//导入平面和立体包
import LiTi.Cylinder;
import LiTi.Cone;
import PingMian.Shape;
import PingMian.Rectangle;
import PingMian.Circle;
import PingMian.Rhomboid;
//测试：
public class TestCalculate {
    public static void main(String[] args){
        int type;
        Scanner scan=new Scanner(System.in);
        try {  //try用于包裹需要进行异常处理的代码块
            do {
                System.out.println("请输入需要计算的平面图形几何图形或立体图形:" +
                        "(长方形=1；圆=2；平行四边形=3；圆柱体=4；圆锥体=5；退出系统=0)");
                type=scan.nextInt();
                if(type==1) {
                    System.out.println("请输入长方形的长:");
                    double length=scan.nextDouble();   //先获取矩形的长
                    System.out.println("请输入长方形的宽:");
                    double width=scan.nextDouble();    //获取矩阵的宽
                    Rectangle rect=new Rectangle(length,width); //调用
                    System.out.println("长方形的周长是："+rect.getPerimeter()+",面积是："+rect.getArea());
                }

                if(type==2) {
                    System.out.println("请输入圆的半径：");//获取圆的半径
                    double radius = scan.nextDouble();
                    Circle c=new Circle(radius);
                    System.out.println("圆的周长是："+c.getPerimeter()+",面积是："+c.getArea());
                }
                if(type==3) {
                    System.out.println("请输入平行四边形的底边长：");
                    double baseline =scan.nextDouble();
                    System.out.println("请输入平行四边形的侧边长：");
                    double sideline =scan.nextDouble();
                    System.out.println("请输入平行四边形的高：");
                    double height =scan.nextDouble();
                    Rhomboid rhom=new Rhomboid(baseline,sideline,height);
                    System.out.println("平行四边形的周长是："+rhom.getPerimeter()+",面积是："+rhom.getArea());
                }
                if(type==4) {
                    Scanner in=new Scanner(System.in);//从键盘读取圆柱体的底面半径和高
                    Cylinder cylinder=new Cylinder();
                    System.out.println("请输入圆柱体的底面半径r和h：");
                    cylinder.SetCylinder(in.nextDouble(),in.nextDouble());
                    System.out.println(String.format("%.2f",cylinder.area()));
                    System.out.println(String.format("%.2f",cylinder.volume()));
                }
                if(type==5) {
                    Scanner in=new Scanner(System.in);//从键盘读取圆锥的底面半径和高
                    Cone cone=new Cone();
                    System.out.println("请输入圆锥体的r和h：");
                    cone.SetCone(in.nextDouble(),in.nextDouble());
                    System.out.println(String.format("%.2f",cone.area()));
                    System.out.println(String.format("%.2f",cone.volume()));

                }

            }while(type!=0);
            System.out.println("运行结束，谢谢使用!");
            scan.close();
            System.exit(0);

        }catch(Exception e) { //catch用于捕获异常并提示输入有误，结束运行
            System.out.println("请输入要求的自然数：整数或小数");
            System.out.println("运行结束，谢谢使用!");
        }
    }
}
