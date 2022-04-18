package day20220414;


//泛型
public class MyArrayG<T> {
    T[] array;
    int size;

    MyArrayG(int initCapacity){
        if(initCapacity <= 0){
            initCapacity = 10;
        }

        array = (T[])new Object[initCapacity];
    }
    //尾插
    public void add(T e){
        if(size == array.length){
            System.out.println("MyArray已经存满了");
            return;
        }
        array[size] = e;
        size++;
    }


    public T get(int index){
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException("MyArray---get:下标越界了");
        }
        return array[index];
    }

    public static void main(String[] args) {
        /*MyArrayG<Person> ma1 = new MyArrayG<Person>(10);*/

        //MyArrayG<Person>:告诉编译器将来ma2中存放的元素的类型是Person类型
        MyArrayG<Person> ma2 = new MyArrayG<>(10);
        ma2.add(new Person());

        /*ma2.add(new Student());*/  //直接报错
        ma2.get(0);
        /*Student s = ma2.get(0);*/

        MyArrayG<Student> ma3 = new MyArrayG<>(10);
        ma3.add(new Student());
        ma3.add(new Student());
        ma3.add(new Student());

        /*ma3.add(new Person());*/

        //  基本类型放不了
        /*MyArrayG<int> ma4 = new MyArrayG<int>(10);*/
        //》》》包装类型
        MyArrayG<Integer> ma4 = new MyArrayG<>(10);
        ma4.add(1);
        ma4.add(2);
        ma4.add(3);
        ma4.add(4);

        /////////////////////////////////////
        //装箱：从int到integer:
        Integer i1 = new Integer(10);
        Integer i2 = Integer.valueOf(100);

        //拆箱：从Integer到int
        int data = i1.intValue();


        //自动装箱和自动拆箱
        //在使用过程中，装箱和拆箱会带来不少代码量，所以，尾款减少开发者的负担，java提供了自动机制
        int i3 = 10;
        Integer ii = i3;             //自动装箱
        Integer ij = (Integer)i3;    //自动装箱


        int j = ii;                 //自动拆箱
        int k = (int)ii;            //自动拆箱

    }

}
