package Pcak1;

public abstract class Shape {
    public String getName() {                        //获得图形的名称
        return this.getClass().getSimpleName();
    }
    public abstract double getArea();                //获得图形的面积
}
