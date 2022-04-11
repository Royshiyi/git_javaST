package day20220411;

public class TestString1 {
    public static void main(String[] args) {
        //十万次
        //直接修改效率，计算时间
        long start = System.currentTimeMillis();    //当前时间
        String s = "";
        for(int i = 0; i < 100000; ++i){        //创建大量对象
            s += i;
        }
        long end = System.currentTimeMillis();      //最终时间
        System.out.println(end - start);            //时间差

        //StringBuffer效率
        start = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("");
        for(int i = 0; i < 100000; ++i){
            sbf.append(i);
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);

        //StringBuilder效率
        start = System.currentTimeMillis();
        StringBuilder sbd = new StringBuilder();
        for(int i = 0; i < 100000; ++i){
            sbd.append(i);
        }
        end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}

