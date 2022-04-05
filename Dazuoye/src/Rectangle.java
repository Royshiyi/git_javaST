public class Rectangle extends Shape {
    @Override
    public double perimeter(double length, double width, double radius) {
        double c1 = 2 * (length + width);
        return c1;
    }
    @Override
    public double area(double length,double width,double radius) {
        double s1=length*width;
        return s1;
    }
}
