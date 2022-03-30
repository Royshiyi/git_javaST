package day20210908;

//成员变量也可以使用就地初始化
public class Date {
    int year = 1900;
    int month = 1;
    int day = 1;

    public Date() {
    }

    public Date(int year, int month, int day) {
        System.out.println(this.year + "-" + this.month + "-" + this.day);
        this.year = year;
        this.month = month;
        this.day = day;
        System.out.println(this.year + "-" + this.month + "-" + this.day);
    }

    public void printDate(){
        System.out.println(year + "-" + month + "-" + day);
    }

    public static void main(String[] args) {
        /*Date d1 = new Date();
        d1.printDate();*/

        Date d2 = new Date(2021,9,8);
        d2.printDate();
    }

}
