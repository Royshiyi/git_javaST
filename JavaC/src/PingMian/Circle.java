package PingMian;

public class Circle extends Shape {//继承：圆
    private double radius;                       //圆形的半径
    public Circle(double radius){
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea() {                    //返回圆的面积
        return Math.PI * Math.pow(radius,2);
    }

    public double getPerimeter(){              //重写父类方法
        return 2*Math.PI*radius;
    }

}
