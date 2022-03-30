package PingMian;
//通过Perimeter和area可以实现矩形的功能
public class Rhomboid implements Perimeter,area{
    double baseline,sideline,heigth;                      //平行四边形的底边，侧边，高，周长，面积
    double Perimeter;
    double area;
    //获取及设置底边长
    public double getbaseline() {
        return baseline;
    }
    public void setbaseline(double baseline) {
        this.baseline = baseline;
    }
    //侧边长get/set
    public double getsideline() {
        return sideline;
    }
    public void setsideline(double sideline) {
        this.sideline = sideline;
    }
    //高get/set
    public double getheigth() {
        return heigth;
    }
    public void setheigth(double heigth) {
        this.heigth = heigth;
    }
    //周长get/set
    public double getPerimeter() {              //返回周长
        return (baseline + sideline) * 2;
    }
    public void setPerimeter(double Perimeter) {
        this.Perimeter = Perimeter;
    }
    //面积get/set
    public double getArea() {
        return baseline * heigth;
    }
    public void setArea(double area) {
        this.area = area;
    }

    public Rhomboid(double baseline, double sideline,double heigth) {
        this.baseline = baseline;
        this.sideline = sideline;
        this.heigth = heigth;
    }

    public void Perimeter() {
        Perimeter = (baseline + sideline) * 2;
        System.out.println("平行四边形的周长为：" + Perimeter);
    }
    public void area() {
        area = baseline * heigth;
        System.out.println("平行四边形的面积为：" + area);
    }

}
