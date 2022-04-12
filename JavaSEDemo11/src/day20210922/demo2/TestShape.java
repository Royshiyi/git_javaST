package day20210922.demo2;

public class TestShape {
    public static void main(String[] args) {
        //注意：抽象类不能实例化对象，对象是一个实实在在存在的一个实体
        //但是可以创建抽象类的引用，因为引用中存放的是对象的地址
        Shape s = null;
        s = new Rect(10,20);
        s.draw();

        s = new Triangle90(3,4,5);
        s.draw();
        s.area();
    }
}
