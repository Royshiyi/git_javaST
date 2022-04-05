public class TestShape {
    public static void main(String[] args) {
        double length=5;
        double width=7.8;
        Shape rectangle=new Rectangle();
        double s1=rectangle.area(length, width, 0);
        double c1=rectangle.perimeter(length, width, 0);
        System.out.println("矩形面积："+s1);
        System.out.println("矩形周长:"+c1);
        double radius=5.5;
        Shape circle=new Circle();
        double s2=circle.area(0, 0, radius);
        double c2=circle.perimeter(0, 0, radius);
        System.out.println("圆形面积："+s2);
        System.out.println("圆形周长:"+c2);
    }
}
