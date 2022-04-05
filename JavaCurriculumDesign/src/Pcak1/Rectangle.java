package Pcak1;
public class Rectangle implements perimeter,area {
    double length;                      //矩形的长
    double width;                       //矩形的宽
    double perimeter,area;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea() {                   //计算矩形的面积
        return length * width;
    }
}

