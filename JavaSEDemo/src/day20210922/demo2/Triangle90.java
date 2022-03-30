package day20210922.demo2;

public class Triangle90 extends Triangle{

    public Triangle90(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public double area() {
        return a*b/2;
    }
}
