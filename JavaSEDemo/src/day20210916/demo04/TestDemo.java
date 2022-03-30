package day20210916.demo04;

public class TestDemo {
    public static void test(BB bb){
        bb.method1();

        //需求：如果bb是DEB类的对象，调用method2
        DEB deb =(DEB)bb;//------>向下转型：不安全的
        //      如果bb是DEBB类的对象，调用method3
    }


    public static void main(String[] args) {
        BB bb = new BB(10);
        DEB deb = new DEB(20);

        test(deb);

        BB bb1 = new DEBB(30);
        //向上转型----经常用---比如实现多态
        test(bb1);
    }
}
