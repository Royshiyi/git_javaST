package day20220417;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

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

        list.add("6666");//ArrayList可以进行动态扩容
        list.add(3,"7777");
        System.out.println(list);


        List<String> list1 = new ArrayList<>();
        list1.add("7777");
        list1.add("8888");

        //将list1中的所有元素插入到list当中
        list.addAll(list1);
        System.out.println(list);

        list.add(0,"0000");
        list.remove(3);             //通过下标删除
        System.out.println(list);
        list.add(5,"2343");
        System.out.println(list);
        list.remove("2343");           //删除遇到的第一个o
        System.out.println(list);

        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));//获取最后一个元素

        if(list.contains("8888")){
            System.out.println("8888已经存在");
        }else{
            list.add("8888");
            System.out.println(list);
        }

        list.set(list.size()-1,"8888-9999");//修改
        System.out.println(list);

        list.clear();               //清空
        System.out.println(list);

        list.add("1111");
        list.add("3333");
        list.add("2222");
        list.add("3333");
        list.add("4444");
        list.add("5555");
        list.add("4444");
        list.add("1111");
        list.add("2222");
        list.add("5555");
        System.out.println(list);
        System.out.println(list.indexOf("4444"));
        System.out.println(list.lastIndexOf("4444"));

        List<String> list3 = new ArrayList<>();
        list3 = list.subList(0,3);              //截取部分list    (0,3)取前不取后
        List<String> list4 = list.subList(3,5); //取前不取后
        System.out.println(list3);
        System.out.println(list4);

        list.clear();
        if(list.isEmpty()){             //list.isEmpty()
            System.out.println("list已经为空了");
        }else{
            System.out.println("list不为空");
        }

    }
}
