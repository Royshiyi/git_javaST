package LiTi;
//接口定义的行为，如果具有该种行为，则都可以实现该类（圆柱）
public class Cylinder implements Yuanzhu{
    //圆柱的底面半径和高
    double r;
    double h;
    public void SetCylinder(double r,double h) {
        this.r = r;
        this.h = h;
    }
    public double area(){
        System.out.println("圆柱体的表面积：");
        return 2*Math.PI*r*r+2*Math.PI*r*h;  //计算圆柱的表面积
    }
    public double volume(){
        System.out.println("圆柱体的体积：");  //计算圆柱的体积
        return Math.PI*r*r*h;
    }
}




