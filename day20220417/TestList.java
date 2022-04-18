package day20220417;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class TestList {
    public static void main(String[] args) {
        //构造ArrayList的对象
        ArrayList<Integer> al1 = new ArrayList<>();

        ArrayList<String> al2 = new ArrayList<>(10);
        al2.add("hello");
        al2.add("world");

        ArrayList<String> al3 = new ArrayList<>(al2);

        List<Integer> List = new ArrayList<>();


    }
}
