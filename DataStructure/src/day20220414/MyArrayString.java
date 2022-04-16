package day20220414;

public class MyArrayString {
    String[] array;
    int size;   //表示有效元素的个数

    public MyArrayString(int initCapacity){
        if(initCapacity <= 0){
            initCapacity = 10;
        }
        array = new String[initCapacity];

    }
    //尾插
    public void add(String e){
        if(size == array.length){
            System.out.println("MyArray已经存满了");
            return;
        }
        array[size] = e;
        size++;
    }


    public String get(int index){
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException("MyArray---get:下标越界了");
        }
        return array[index];
    }

    public static void main(String[] args) {


        MyArrayString ma2 = new MyArrayString(10);
        ma2.add("1111");

    }
}
