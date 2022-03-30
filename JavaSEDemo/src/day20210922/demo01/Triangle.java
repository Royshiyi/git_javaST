package day20210922.demo01;

//三角形：已经是一个具体的图形了
public abstract class Triangle {

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

    public static void main(String[] args) {
        //Triangle t = new Triangle();
    }
}
