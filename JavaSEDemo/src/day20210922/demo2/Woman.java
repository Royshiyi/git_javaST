package day20210922.demo2;

public class Woman extends Person{
    @Override
    void gotoWC(WC wc) {
        wc.gotoWomanRoom();
    }
}
