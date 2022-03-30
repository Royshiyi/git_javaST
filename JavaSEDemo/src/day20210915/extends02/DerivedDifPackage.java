package day20210915.extends02;
import day20210915.extends03.Base;

public class DerivedDifPackage extends Base{
    //不在同一个包中
    public void method(){
        pub = 10;
        pro = 20;
        /*def = 30;
        pri = 40;*/
    }

}
