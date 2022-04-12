public class Oprtator {
    public static void main(String[] args) {
        //自增自减
        int a = 10;
        a++;//后置++
        System.out.println(a);//11

        //先使用后++
        int ret = a++;
        System.out.println(a);//12
        System.out.println(ret);//11

        //前置++,先++后使用
        ret =++a;
        System.out.println(a);//13
        System.out.println(ret);//13

        ++a;//前置++
        System.out.println(a);//14

        a--;
        --a;
    }

    public static void main2(String[] args) {
    //增量运算符+= -= *= /= %=

        int a = 10;
        a += 1;
        System.out.println(a);
        a -= 1;
        System.out.println(a);
        a *= 1;
        System.out.println(a);
        a /= 1;
        System.out.println(a);
        a %= 1;
        System.out.println(a);

        //增量运算符不能运用在常量上
        //10 += 3;

        //用户也可以定义自己需要的常量
        //SIZE:就是用户自己定义的常量---指的是:值不能修改
        final int SIZE = 100;
        //SIZE += 1;   // (不行)

        //在C语言中,可以使用const定义不可修改的常量
        //在java中,只能使用final 来定义常量-----const不能使用,因为const是java中的保留字
        //保留字:这个标识符现在没有特殊的含义,将来可能会用到---因此定义变量时,变量名字不能用const
        //int const = 10;


    }
    public static void main1(String[] args) {
        //基本四则运算+ - * / %
        int a = 10;
        int b = 20;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);//int / int---->结果也是int ,并且会影响向下取整
        System.out.println(a % b);//除完之后的余数

        //注意:除数一定不能是0
        //System.out.println(a / 0);

        //注意:不能模0
        //System.out.println(a % 0);

        //注意:在java中,double小数也可以取模,但一般不会对小数取摸
        System.out.println(11.5 % 2.0);

        //类型不一致时,会进行类型提升(int--->double)
        System.out.println(10 + 3.7);

    }
}
