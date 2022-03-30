package day20210826shuzu;

public class Myarray {
    //1.为什么需要数组
    //假设现在需要保存5个同学javase的成绩，并对成绩进行打印

    //如果有一百个同学呢（不方便）；假设还想加上每个同学的平时分；就需要操作100个变量；如果需要使用------》没有办法传递
    //能否有一种结构将这些用同学的成绩全都储存起来；------》》》数组
    public static void SEScore(){
        int score1 = 70;
        int score2 = 80;
        int score3 = 90;
        int score4 = 60;
        int score5 = 55;

        System.out.println(score1);
        System.out.println(score2);
        System.out.println(score3);
        System.out.println(score4);
        System.out.println(score5);
    }

    public static void createArray(){
        //T[] 数组名 = new T[N]
        //要创建包含10int类型的数组；
        int[] array1 = new int[10];

        //要创建包含三个double类型的数组；
        double[] array2 = new double[3];

        //要创建包含5个字符串类型的数组；
        String[] array3 = new String[5];
    }
    //1.在java当中如果数组没有初始化，里面的随机值还是什么其他内容；
    //2.如何初始化一个数组；
    public static void initArray(){
        //1.动态初始化------>直接给定数组的大小
        int[] array = new int[10];

        //2.静态初始化
        int[] array2 = {0,1,2,3,4,5,6,7,8,9};
            //等同于==
        int[] array3 = new int[]{0,1,2,3,4,5,6,7,8,9};

        //注意不能将动态与静态初始化结合使用；
        //比如：
        //int[] array4 = new int[10]{0,1,2,3,4,5,6,7,8,9};

        //也可以用类似C语言的方式来定义并初始化数组------但不推荐；
        int array5[] = new int[10];
        int array6[] ={0,1,2,3,4,5,6,7,8,9};

        //在某些情况下，明确知道学要一个数组，但是前期可能不知道需要多大空间
        int[] array7;//此处并没有给数组申请空间
        //....
        array7 = new int[100];//当jvm看到new之后才会真正的从堆上给数组开辟内存空间

        int[] array8;
        //....
        array8 = new int[]{1,2,3,4,5};
        //静态初始化分开写的时候不能省略new[]
        /*int[] array9;
        array9 ={1,2,3,4,5}*/ //编译出错
    }
    public static void accessArrayElem(){
        int[] array = {1,2,3,4,5};//数组下标：[0,5)
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        //注意下标一定不能越界
        //数组越界异常
        //System.out.println(array[5]);
    }
    public static void traverseArray(){
        /*int score1 = 70;
        int score2 = 80;
        int score3 = 90;
        int score4 = 60;
        int score5 = 55;*/
        int[] score ={70,80,90,60,55};

        /*System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);
        System.out.println(score[3]);
        System.out.println(score[4]);*/
        for(int i = 0; i < 5; i++){
            score[i] *= 2;              //打印内容与数组元素本身都发生改变
            System.out.println(score[i]);
        }
        //数组遍历一般结合循环进行
        System.out.println("---------------");
        //可以不指明数组的下标,e就是数组中的元素的拷贝
        for(int e:score){
            e *= 2;
            System.out.println(e);//打印内容发生变化但数组内的元素其实并没有变化，需要修改，用for

        }
        //有些情况下,我们可能不知道数组的长度
    }

    public static void mul2printlnArray(int[] array){
        //array.length:表示array数组中有多少个元素-------》数组的长度
        System.out.println(array.length);

        for(int i = 0; i < array.length; i++){
            array[i] *= 2;
            System.out.println(array[i]);
        }
    }

    public static void arrayMemory(int p){
        int a = 10;
        int b = 20;
        int c = 30;

        int[] array = {1,2,3,4,5};
    }

    public static void arrayMemory(){
        int[] array1 = new int[5];
        array1[0] = 10;
        array1[1] = 20;

        int[] array2 = {1,2,3,4,5};
        array2[0] = 100;
        array2[1] = 200;

        array1 = array2;

        array2[2] = 300;
        array2[3] = 400;

    }
    public static void main(String[] args) {
        arrayMemory();
        arrayMemory(10);
        int[] arr = {1,2,3,4,5};
        mul2printlnArray(arr);
        traverseArray();
        accessArrayElem();
        initArray();
        SEScore();
        createArray();
    }
}
