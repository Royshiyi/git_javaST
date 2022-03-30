package day20210916.demo02;

public class Base {
    public void method1(int a){
        System.out.println("Base----method(int)");
    }

    public void method2(){
        System.out.println("Base--method2()");
    }

    public Base method3(){
        return this;
    }



    //以下方法是不能被重写的
    /*public static void methodStatic(){
        System.out.println("Base-----methodStatic");
    }*/
    /*private void methodPrivate(){
        System.out.println("Base---methodPrivate");
    }*/

}
