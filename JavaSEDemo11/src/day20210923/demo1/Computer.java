package day20210923.demo1;

public class Computer {

    private String name;
    private double price;

    public void PowerOn(){
        System.out.println("笔记本开机");

    }

    public void PowerOff(){
        System.out.println("笔记本关机");
    }

    public void useDevice(IUSB usb){
        if(null == usb){
            System.out.println("没有设备连接");
            return;
        }

        usb.openDevice();
        //使用
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse)usb;//向下转型
        }else if(usb instanceof KeyBoard){
            KeyBoard keyBoard = (KeyBoard)usb;
            keyBoard.input();
        }else{
            System.out.println("无法识别的设备");
        }
        usb.closeDevice();

        System.out.println(IUSB.type);
        //type 默认是static类型的成员变量
        /*IUSB.type = 2.0;*/
    }
}
