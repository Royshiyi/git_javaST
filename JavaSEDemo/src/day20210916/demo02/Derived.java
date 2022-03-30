package day20210916.demo02;

public class Derived extends Base{
    @Override
    public void method1(int a){
        System.out.println("Derived----method(int)");
    }

    @Override
    public Derived method3(){
        return this;
    }

    //@Override
    /*public static void methodStatic(){
        System.out.println("Derived-----methodStatic");
    }*/
    //@Override
    /*private void methodPrivate(){
        System.out.println("Base---methodPrivate");
    }*/
}
