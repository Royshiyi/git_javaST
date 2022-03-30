package day20210922;

public class TestAnimal {

    public static void testEat(Animal a){
        a.eat();
    }
    public static Animal buyAnimal(String name){
        if(name.equals("猫")){
            return new Cat("111","公",1);

        }else if(name.equals("狗")){
            return new Dog("222","公",1);
        }else{
            return null;
        }

    }
    public static void main(String[] args) {
        testEat(new Cat("元宝","公",1));
        testEat(new Dog("小七","公",2));

        Animal a1 = buyAnimal("猫");
        a1.eat();
        //缺陷：编译器在编译阶段，会将a1识别成Animal的这种类型
        //所有通过a1调用的方式，都会在Animal类当中去查找
        /*a1.mew();*/
        //但是实际上a1指的是一个Cat对象
        Cat cat =  (Cat)a1;
        cat.mew();

        //a1实际指向的是一个猫的对象
        //但是此处是将猫的引用强转成Dog类的对象
        //java.lang.ClassCastException
        //Animal不一定是狗，Animal也可能是猫
        /*Dog d = (Dog)a1;
        d.bark();*/

        //======》
        if(a1 instanceof Dog){
            Dog d = (Dog)a1;
        }

        Animal a2 = buyAnimal("狗");
        a2.eat();

        if(a2 instanceof Dog){
            Dog dog = (Dog)a2;
            dog.bark();
        }
        Dog dog = (Dog)a2;
        dog.bark();

    }
}
