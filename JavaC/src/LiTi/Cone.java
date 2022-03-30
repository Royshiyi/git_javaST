package LiTi;
//接口定义的行为，如果具有该种行为，则都可以实现该类（圆锥）
public class Cone implements Yuanzhui{
    //圆锥的底面半径和高
    double r;
    double h;
    public void SetCone(double r,double h) {
        this.r = r;
        this.h = h;
    }
    public double area(){
        System.out.println("圆锥体的表面积：");
        return Math.PI*r*(r+Math.sqrt(Math.pow(r,2)+Math.pow(h,2)));//计算圆锥的表面积
    }
    public double volume(){
        System.out.println("圆锥体的体积：");
        return Math.PI*h*Math.pow(r,2)/3;    //计算圆锥的体积
    }
}
