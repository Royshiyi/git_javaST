package day20210912.extendTest6;

public class Zi extends Fu{
    int d = 20;

    public Zi(int a, int d){
        //System.out.println("Zi");
        super(a);//必须在第一条
        //this();//也必须是第一条-----不能同时存在
        this.d = d;
    }
    public Zi(){
        super(10);
        //super(20);编译失败：super在子类构造方法中只能出现一次
    }
}
