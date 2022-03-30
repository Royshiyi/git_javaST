package day20210909;
/*import java.util.Date;
import java.util.List;*/

import com.bite.demo;
//import com.bite.person;

import java.beans.DesignMode;
import java.util.*;
import java.sql.*;

//可以直接使用Math类当中所有的静态成员
import static java.lang.Math.*;

public class TestPackage {
    public void method(){
        demo d = new demo();
        //person p = new person();
    }

    public static void main(String[] args) {
        //需求：获取系统的时间

        //包中的使用方式一： 优点：一定不会发生冲突   优点：使用起来比较麻烦
        java.util.Date d1 = new java.util.Date();
        System.out.println(d1.getTime());


        //包中的使用方法二：（import java.util.Date;）
        //优点：使用起来非常方便  缺点：可能会产生冲突
        //如何解决：将Date类的完整路径具体化—————采用方式一
        java.util.Date d2 = new java.util.Date();//Date d2 = new Date();
        //得到一个毫秒级别的时间戳
        System.out.println(d2.getTime());

        int[] array ={1,2,3,4,5};
        Arrays.sort(array);

        //包中类使用方法三：
        //需求：100的平方根
        //加了import static java.lang.Math.*;之前
        System.out.println(Math.sqrt(100));
        Math.max(10,100);
        //加了import static java.lang.Math.*;之后
        min(100,10);

    }
}
