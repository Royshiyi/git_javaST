package Pcak1;

interface  perimeter{
    public void perimeter();
}
interface  area{
    public void area();
}
public class PingMian {
    public static void main(String[] args) {
        Circle circle = new Circle(1);                    //创建圆形对象并将半径设置为1

        Rectangle rect = new Rectangle(1, 1);        //创建矩形对象并将长和宽设置为1
        rect.perimeter();
        rect.area();
        Parallelogram para = new Parallelogram();
    }

}
