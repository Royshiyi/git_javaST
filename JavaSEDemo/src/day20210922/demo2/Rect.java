package day20210922.demo2;

public class Rect extends Shape{
    protected int length;
    protected int width;

    public Rect(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw(){
        System.out.println("我是一个巨型：length:"+length + "width=" + width);

    }
    @Override
    public double area(){
        return length*width;
    }
}
