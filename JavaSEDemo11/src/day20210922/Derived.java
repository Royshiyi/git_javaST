package day20210922;

public class Derived extends Base{

    public Derived(){
        super();
        b = 100;
    }

    @Override
    public void func(){
        System.out.println(b);
    }

    public static void main(String[] args) {
        Base b = new Derived();
        b.func();
    }
}
