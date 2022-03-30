package day20210922.demo2;

public class Man extends Person{
    @Override
    void gotoWC(WC wc) {
        wc.gotoManRoom();
    }
}
