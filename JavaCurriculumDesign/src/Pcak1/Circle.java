package Pcak1;

public class Circle extends Shape {
    private double radius;                       //圆形的半径
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {                    //计算圆形的面积
        return Math.PI * Math.pow(radius, 2);
    }
}

