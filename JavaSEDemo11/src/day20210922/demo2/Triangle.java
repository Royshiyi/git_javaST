package day20210922.demo2;


//没有重写Shape抽象类中area这个抽象方法
//Triangle也是抽象类
public abstract class Triangle extends Shape {
    double a;
    double b;
    double c;

    //抽象类中是可以包含构造方法的，用来初始化当前类
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    {
        a = 1.0;
        b = 2.0;
        c = 3.0;
    }
    public boolean isTriangle(){
        if((a + b)>c && (a+c)>b &&(b+c)>a){
            return true;
        }
        return false;
    }
    @Override
    void draw(){
        System.out.println("我是一个三角形");
    }
}
