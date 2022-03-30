package day20210824diguishuzu;

public class Recursion {
    //递归练习4：求斐波那契数列的第 N 项

    //递归练习3：写一个递归的方法，输入一个非负整数，返回组成它的数字和，例如，输
    // 入1729则应返回1+7—+2—+9
    public static int SumNum2(int num){
        if(num < 10){
            return num;
        }
        return num%10 + SumNum2(num/10);
    }

    //递归练习2：递归求1+2+3+4+5+6...+10
    public static int SumNum(int num){
        if(num == 1){
            return 1;
        }
        return num + SumNum(num - 1);
    }

    //递归练习1：按顺序打印一个数字的每一位（例如1234打出1 2 3 4）
    public static void printNum(int data){
        //1.出口
        //2.如何调用自身---拆分
        if (data > 9) {
            printNum(data / 10);
        }
        System.out.println(data % 10);
    }

    public static void main(String[] args) {
        printNum(1234);
        System.out.println(SumNum(10));
        System.out.println(SumNum2(1729));
    }
}
