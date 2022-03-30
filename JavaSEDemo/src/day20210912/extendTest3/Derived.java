package day20210912.extendTest3;

public class Derived extends Base{
    //与基类中methodA（）参数列表不同
    public void methodA(int a){
        System.out.println("Derived---->methodA(int)");
    }
    //与基类中methodB（）原型是一致的
    public void methodB(){
        System.out.println("Derived---->methodB()");
    }
    void testMethod(){
        //关系：构成了方法的重载
        methodA(10);    //子类自己新增加的methodA
        methodA();         //从基类中继承的methodA

        //后续看到的重写---->多态
        methodB();//就近调子类自己的
        super.methodB();//super调基类的methodB


    }
    //super不能在静态方法中使用
    public static void testSuper(){
        //super.methodB();
    }



    public static void main(String[] args) {
        Derived d = new Derived();
        d.methodA(100);
        d.methodB();
        d.methodA();

        d.testMethod();
    }

}
