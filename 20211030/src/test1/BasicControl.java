package test1;

public class BasicControl {
    public static void main(String[] args) {
        //闰年
        int year = 2001;
        if((0 == year % 4 && 0 != year % 100) ||(0 == year % 400)){
            System.out.println(year + "是闰年");
        }else{
            System.out.println(year + "不是闰年");
        }
    }

    public static void main3(String[] args) {
        int data = 1;
        if(0 == data % 2){
            System.out.println(data+"是整数");
        }else{
            System.out.println(data+"是奇数");
        }
    }

    public static void main2(String[] args) {
        int score = 59;
        if(score >=90 && score <= 100){
            System.out.println("优秀");
        }else if(score >= 80 && score < 90){
            System.out.println("良好");
        }else if(score >= 70 && score < 80){
            System.out.println("一般");
        }else if(score >= 60 && score < 70){
            System.out.println("及格");
        }else if(score >= 0 && score < 60){
            System.out.println("不及格");
        }else{
            System.out.println("非法成绩");
        }

    }

    public static void main1(String[] args) {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");


        int score = 90;
        if(score>=90){
            System.out.println("奖励一个大鸡腿");
        }

    }
}
