package day20210923.demo02;

public class TestAnimal {

    public static void walk(IRunning r){
        r.run();
    }

    public static void main(String[] args) {
        IRunning[] animals = {  new Cat("元宝",1),
                                new Dog("小七",1),
                                new Duck("小黄鸭",2)};

        for(int i = 0;i < animals.length;i++){
            walk(animals[i]);
        }
    }
}
