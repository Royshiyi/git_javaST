package day20210923.demo1;

public class TestComputer {
    public static void main(String[] args) {

        //注意接口不能直接实例化对象，但是可以定义接口的引用
        Computer com = new Computer();
        com.PowerOn();
        com.useDevice(new Mouse());
        com.useDevice(new KeyBoard());
        com.PowerOff();

    }
}
