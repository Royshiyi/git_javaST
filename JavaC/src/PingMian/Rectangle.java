package PingMian;
import sun.security.util.Length;
//通过Perimeter和area可以实现矩形的功能
public class Rectangle implements Perimeter,area {
    double length;                      //矩形的长
    double width;                       //矩形的宽
    double Perimeter;                   //周长
    double area;                        //面积

    public double getLength() {//获取矩形的长度
        return length;
    }
    public void setLength(double length) {//设置长度
        this.length = length;
    }

    public double getWidth() {//获取宽度
        return width;
    }
    public void setWidth(double width) {//设置宽度
        this.width = width;
    }

    public double getPerimeter() {//获取周长
        return (length + width) * 2;
    }
    public void setPerimeter(double Perimeter) {//设置周长
        this.Perimeter = Perimeter;
    }

    public double getArea() {//获取面积
        return length * width;
    }
    public void setArea(double area) {//设置面积
        this.area = area;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public void Perimeter() {
        Perimeter = (length + width) * 2;
        System.out.println("矩形的周长为：" + Perimeter);
    }
    public void area() {
        area = length * width;
        System.out.println("矩形的面积为：" + area);
    }

}


