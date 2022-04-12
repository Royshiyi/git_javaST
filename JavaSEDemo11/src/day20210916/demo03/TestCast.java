package day20210916.demo03;

public class TestCast {

    public static void main(String[] args) {
        //向上转型：可以将一个子类对象当成基类来使用
        Animal animal= new Animal("匿名","无",0);
        Dog dog = new Dog("小七","公",1);

        Cat cat = new Cat("元宝","男",2);

    }
}
