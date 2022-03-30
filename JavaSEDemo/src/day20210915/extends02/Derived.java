package day20210915.extends02;

public class Derived extends Base{
    int c;
    int d;

    public void method(Derived this){
        super.a = 10;
        super.b = 20;

        this.c = c;
        this.d = d;
    }

    public static void main(String[] args) {
        Derived d = new Derived();
        d.method();
    }
}
