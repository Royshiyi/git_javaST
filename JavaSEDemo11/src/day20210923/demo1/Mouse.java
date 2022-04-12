package day20210923.demo1;

public class Mouse implements IUSB{
    @Override
    public void openDevice() {
        System.out.println("打开鼠标设备");
    }

    @Override
    public void closeDevice() {
        System.out.println("关闭鼠标设备");
    }

    public void click(){
        System.out.println("鼠标点击");
    }
}
