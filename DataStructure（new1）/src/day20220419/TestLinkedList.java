package day20220419;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class TestLinkedList {
    public static void method1(){
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        List<Integer> list2 = new LinkedList<>(al);
        System.out.println(list2);


    }


    public static void method2(){
        List<String> list = new LinkedList<>();
        list.add("1111");
        list.add("2222");
        list.add("3333");
        list.add("4444");
        System.out.println(list.size());
        System.out.println(list);

        list.add(0,"0000");
        System.out.println(list);

        System.out.println(list.get(1));
        list.set(1,"11111");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);
        list.remove("4444");
        System.out.println(list);

        list.add(0,"0000");
        list.add("0000");
        System.out.println(list.indexOf("0000"));
        System.out.println(list.size()-1);
        System.out.println(list.lastIndexOf("0000"));


    }

    //遍历
    public static void method3(){
        List<String> list = new LinkedList<>();
        list.add("1111");
        list.add("2222");
        list.add("3333");
        list.add("4444");

        //方式一：for循环遍历  get方法
        //效率最低，因为get（）是一个O（n）的方法
        for(int i = 0;i < list.size();i++){
            System.out.print(list.get(i) + " ");

        }
        System.out.println();

        //方式二：foreach
        for(String e : list){
            System.out.print(e + " ");
        }
        System.out.println();

        //方式三：迭代器
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();


    }

    public static void main(String[] args) {
        //method1();
        /*method2();*/
        method3();
    }
}
