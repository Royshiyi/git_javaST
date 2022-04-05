public class Circle extends Shape {
    @Override
    public double perimeter(double length,double width,double radius) {
        double c2=2*Math.PI*radius;
        return c2;
    }

    public double area(double length,double width,double radius) {
        double s2=radius*radius*Math.PI;
        return s2;
    }
}