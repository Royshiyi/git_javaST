package day20210829;

/*public class Date {
    public int year;
    public int month;
    public int day;

    //在成员方法中，有一个隐藏的this应用，this引用的是当前对象---》调用这个歌方法的对象
    public void setDate(int y,int m,int d){
        System.out.println(this);
        year = y;
        month = m;
        day = d;

    }
    public void printData(){
        System.out.println(this);
        System.out.println(year + "年" + month + "月" + day + "日");
    }

    public void SetYear(int year){
        year = year;
    }

    public static void main(String[] args) {
        Date d1 = new Date();
        d1.setDate(2021,8,28);
        d1.printData();

        System.out.println("------------------");

        Date d2 = new Date();
        d2.setDate(2021,8,29);
        d2.printData();

        System.out.println("------------------");

        Date d3 = new Date();
        d3.setDate(2021,8,30);
        d3.printData();
    }
}*/

//上述类经过编译器编译完成后就成为以下样子
public class Date {
    public int year;
    public int month;
    public int day;

    //在成员方法中，有一个隐藏的this应用，this引用的是当前对象---》调用这个歌方法的对象
    public void setDate(Date this,int y, int m, int d) {
        System.out.println(this);
        this.year = y;
        this.month = m;
        this.day = d;

    }

    public void printData(Date this) {
        System.out.println(this);
        System.out.println(this.year + "年" + this.month + "月" + this.day + "日");
    }

    public void SetYear(int year) {
        this.year = year; 
    }

    public static void main(String[] args) {
        Date d1 = new Date();
        d1.setDate(2021,8,28);
        d1.printData();

        System.out.println("------------------");

        Date d2 = new Date();
        d2.setDate(2021,8,29);
        d2.printData();

        System.out.println("------------------");

        Date d3 = new Date();
        d3.setDate(2021,8,30);
        d3.printData();

        //1.代码能否通过编译，2.程序能否正常运行
        Date d4 = null;
        d4.printData();
    }
}