package day20220417;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //尾插：add
        list.add("1111");
        list.add("2222");
        list.add("3333");
        list.add("4444");
        list.add("5555");
        System.out.println(list.size());//size():有效元素的个数
        System.out.println(list);

        //方式一：for+下标
        for(int i = 0;i < list.size(); i++){
            System.out.print(list.get(i) +" ");
        }
        System.out.println();

        //方式二：foreach遍历
        for(String s : list){
            System.out.print(s +" ");
        }
        System.out.println();

        //方式三：迭代器遍历
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

    }
}
