package day20210915.extends03;


//基类不同访问权限修饰的成员，在子类中能否使用-----可见性
public class Base {
    public int pub;
    int def;
    protected int pro;
    private int pri;


    public void methodPublic(){

    }

    protected void methodProtected(){

    }

    void methodDefault(){

    }
    private void methodPrivate(){

    }
}
