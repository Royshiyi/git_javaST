package day20210923;

public class InterfaceImp implements Iinterface{

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    @Override
    public void method4() {

    }

    public static void main(String[] args) {
        //接口并不是类，因此接口是不能实例化对象的
        /*Iinterface Li = new Iinterface();*/
        InterfaceImp interfaceImp = new InterfaceImp();

    }
}
