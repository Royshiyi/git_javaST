package day20210923.demo02;

import java.util.Arrays;
public class Student implements Comparable{
    private String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student)o;
        //this :表示当前对象
        //o:要和this比较的对象

        if(score >s.score){
            return 1;
        }else if(score < s.score){
            return -1;
        }else{
            return 0;
        }

    }

    //object里的一个普通方法
    @Override
    public String toString() {
        String s = new String("[");
        s += name;
        s += ",";
        s += score;
        s += "]";
        return s;
    }

    public static void main(String[] args) {
        int[] array1 = {3,8,0,5,9,1,4,2,7,6};
        Arrays.sort(array1);
        for(int i = 0;i<array1.length;i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        Student[] array2 = {
                new Student("张三",90),
                new Student("李四",87),
                new Student("王五",98),
                new Student("赵六",60)
        };
        Arrays.sort(array2);

        for(int i = 0;i<array2.length;i++){
            System.out.println(array2[i]);
        }
    }
}
