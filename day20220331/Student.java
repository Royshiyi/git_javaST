package day20220331;

import java.util.Arrays;

public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "[" + this.name + ":" + this.score + "]";

    }

    Student[] students = new Student[]{
            new Student("张三",95),
            new Student("李四",96),
            new Student("王五",97),
            new Student("赵六",92),
    };

    Arrays.sort(students)
}