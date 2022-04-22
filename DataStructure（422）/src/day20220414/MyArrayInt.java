package day20220414;

public class MyArrayInt {
    int[] array;
    int size;   //表示有效元素的个数

    public MyArrayInt(int initCapacity){
        if(initCapacity <= 0){
            initCapacity = 10;
        }
        array = new int[initCapacity];

    }
    //尾插
    public void add(int e){
        if(size == array.length){
            System.out.println("MyArray已经存满了");
            return;
        }
        array[size] = e;
        size++;
    }


    public int get(int index){
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException("MyArray---get:下标越界了");
        }
        return array[index];
    }

    public static void main(String[] args) {
        MyArrayInt ma = new MyArrayInt(100);
        ma.add(1);
        ma.add(2);
        ma.add(3);
        ma.add(4);
        ma.add(5);

        /*MyArray ma2 = new MyArray(10);
        ma2.add("1111");//  4  已经给定了是int[] array 自然不能存放字符串
        //解决方法：*/

    }
}
