package day20220414;

class Person {
    String name;
    int age;

    public String getName(){
        return name;
    }


}
class Student{
    String name;
    int age;

    public int getAge(){
        return age;
    }
}

public class MyArray {
    Object[] array;
    int size;   //表示有效元素的个数

    public MyArray(int initCapacity){
        if(initCapacity <= 0){
            initCapacity = 10;
        }
        array = new Object[initCapacity];

    }
    //尾插
    public void add(Object e){
        if(size == array.length){
            System.out.println("MyArray已经存满了");
            return;
        }
        array[size] = e;
        size++;
    }


    public Object get(int index){
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException("MyArray---get:下标越界了");
        }
        return array[index];
    }

    public static void main(String[] args) {
        /*MyArrayInt ma = new MyArrayInt(100);
        ma.add(1);
        ma.add(2);
        ma.add(3);
        ma.add(4);
        ma.add(5);

        MyArray ma2 = new MyArray(10);
        ma2.add("1111");//  4  已经给定了是int[] array 自然不能存放字符串
        //解决方法：Object*/

        MyArray ma = new MyArray(10);
        ma.add(new Person());
        ma.add(new Person());
        ma.add(new Person());

        //向下转型：不安全
        Person p = (Person)ma.get(0);

        ma.add(new Student());
        ma.add(new Student());
        ma.add(new Student());
        //这种错误编译阶段无法暴露出来，在代码运行期间发生ClassCastException
        Student s = (Student)ma.get(0);//0号位是Person,却又可以用学生接收
        s.getAge();
    }
}
