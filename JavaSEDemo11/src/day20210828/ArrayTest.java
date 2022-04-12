package day20210828;

import java.util.Arrays;

public class ArrayTest {
    public static void method(int param){
        System.out.println("修改之前:"+param);
        param = 100;
        System.out.println("修改之后:"+param);
    }

    //引用类型作为方法传参
    //注意：在方法中并没有改变引用变量引用空间的内容，此处改变的是引用本身

    public static void method2(int[] array){
        array = new int[5];
        array[0] = 100;
        array[1] = 200;

    }

    //引用类型作为方法的参数；
    //在方法中修改的是引用形参指向空间中的内容---即将实参指向空间中修改的内容
    //在方法结束之后，该修改会继续保留；
    public static void method3(int[] array){
        array[0] = 100;
        array[1] = 200;

    }
    //只能依靠数组来交换
    public static void swap(int x,int y){
        int temp = x;
        x = y;
        y = temp;

    }


    public static void swap(int[] array){
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;

    }

    //数组作为方法的返回值-----通过返回值，可以将一个引用带出去
    //比如：在方法中申请了一个数组，然后通过返回值返回数组
    //在调用方法中可以使用该数组
    //需求：返回值斐波那契数列的前n项
    public static long[] fib(int n){
        if(0 == n)
            return null;
        long[] ret = new long[n];
        ret[0] = 1;
        ret[1] = 1;
        for(int i = 2;i<n;++i){
            ret[i] = ret[i-1] + ret[i-2];
        }
        return ret;
    }


    public static String toString(int[] array){
        String strRet = "[";
        for(int i = 0;i < array.length;i++){
            strRet += array[i];
            strRet += ", ";
        }
        strRet += array[array.length-1];
        strRet += "]";

        return strRet;
    }

    //在array数组中查找key，如果存在返回key的下标，否则返回-1
    //顺序查找--如果数组中有n个元素，最差情况下比较n次
    public static int Find(int[] array,int key){
        for(int i = 0;i < array.length;++i){
            if(key == array[i]){
                return i;
            }
        }
        return -1;
    }

    //二分查找：前提集合必须是有序的
    //假设：array是升序的
    public static int binarySearch(int[] array,int key){
        int left = 0;
        int right= array.length-1;

        while(left <= right){
            int mid = left + (right - left)>>1;//int mid =(left+right)/2; (不好，容易溢出）
            if(key == array[mid]){
                return mid;
            }else if(key<array[mid]){
                right =mid-1;
            }else{
                left =mid+1;
            }
        }
        return -1;
    }
    //冒泡排序（自己写）
    public static void bubbleSort(int[] array){
        //外部循环：控制冒泡
        for(int i = 0;i<array.length-1;++i){
            boolean isChange = false;

            //1.冒泡的趟数
            //2.冒泡的方式：---将相邻元素进行比较，如果前一个大于后一个元素，则交换---一趟冒泡结束后最大元素已经在最大的位置上了
            //j:表示亮个相零元素后一个的下标
            for(int j = 1;j < array.length - i;++j){
                if(array[j-1] > array[j]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    isChange = true;
                }
            }
            if(isChange){
                return;
            }
        }

    }

    public static void main(String[] args) {
        int[] array = new int[10];//

        int[][] array2 = new int[10][10];

        //二维数组的每个元素都是一维数组
        int[][] array3 = {{1,2,3,4},{2,3,4,5},{3,4,5,6}};
        for(int i = 0; i<array3.length;++i){ //取到二维数组中的每个元素---一维数组
            for(int j = 0;j < array3[i].length;++j){
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
    }


    //数组排序（冒泡排序）
    public static void main8(String[] args) {
        int[] array = {3,9,1,6,0,8,2,7,4,5};
        bubbleSort(array);
        //Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void main7(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Find(arr,4));
        System.out.println(Find(arr,10));
        //Arrays.binarySearch()
    }

    public static void main6(String[] args) {
        int[] src = {1,2,3,4,5};
        int[] dst = new int[src.length];

        for(int i = 0;i <src.length;++i){
            dst[i] = src[i];
        }

        System.out.println(Arrays.toString(dst));

        //注意：在copyOf当中，创建了一个新的数组，然后将src中，newLength个元素拷贝到新的数组中
        //然后将这个新数组返回、
        int[] array1 = Arrays.copyOf(src,3);
        System.out.println(Arrays.toString(array1));

        int[] array2 = Arrays.copyOf(src,src.length);
        System.out.println(Arrays.toString(array2));

        array2[0] = 100;
        array2[1] = 200;

        int[] array3 = Arrays.copyOfRange(src,1,3);
        System.out.println(Arrays.toString(array3));

    }

    //数组的打印
    public static void main5(String[] args) {
        int[] array = {1,2,3,4,5};
        for(int i =0;i<array.length;++i){
            System.out.print(array[i] + " ");
            //在打印时是将需要打印的内容转换为字符串，再打印
        }
        System.out.println();

        for(int e : array){
            System.out.print(e + " ");
        }
        System.out.println();

        //还可以直接把数组转换为字符串
        String strArray = Arrays.toString(array);
        System.out.println(strArray);


        strArray = toString(array);
        System.out.println(strArray);
    }


    public static void main4(String[] args) {
        int n =10;
        long[] rst = fib(n);
        for(long x : rst){
            System.out.println(x + "");
        }
        System.out.println();
    }

    public static void main3(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a + "\n" + b);

        System.out.println("==============================");

        int[] arr = new int[2];
        arr[0] = a;
        arr[1] = b;
        swap(arr);
        a = arr[0];
        b = arr[1];
        System.out.println(a + "\n" + b);

    }

    public static void main2(String[] args) {
        int a = 100;
        int b = 200;
        swap(a,b);
        System.out.println(a);
        System.out.println(b);

        System.out.println("===================");
        int[] arr = new int[3];
        method3(arr);
        //method2(arr);
        for(int x : arr){
            System.out.println(x);
        }
        System.out.println("=======================");

        //int a = 10;
        method(10);
        System.out.println("method方法调用结束后："+a);
    }

    //需要一个数组，但是不知道需要储存多少个元素
    //将要需要根据程序的运行结果来确定数组的大小
    public static void main1(String[] args){
        int a = 100;
        int[] array = new int[a];

        int[] array2 = null;  //null----->空引用，array2没有指向任何内容
        //注意：不能对一个null引用变量进行操作
        System.out.println(array2[0]);
        //...
        int n = 10;
    }


}
