package day20220418;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);                //每加一个元素就需要扩容一次
        }
        //修改====》
        List<Integer> list1 = new ArrayList<>(100);//可以提前给定100个空间，这样就不需要一次次扩容了
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
    }
}
