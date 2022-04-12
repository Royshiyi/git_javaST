package day20210915.extends03;

public class DerivedSamePackage extends Base{
    public void method(){
        pub = 10;
        def = 20;
        pro = 30;
        //pri不可见
        /*pri = 40;*/


        methodPublic();
        methodDefault();
        methodProtected();
        /*methodPrivate();*/
    }
}
