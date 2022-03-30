package day20210915.extends01;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Zi extends Fu{
    public Zi(){
        //编译器会在子类构造方法中通过super调用基类的构造方法
        super(0);
        System.out.println("Zi");
    }

    public static void main(String[] args) {
        Zi zi = new Zi();
    }
}
