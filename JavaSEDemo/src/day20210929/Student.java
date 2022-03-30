package day20210929;

class Money implements Cloneable{
    double d = 12.34;

    @Override
    public Money clone() throws CloneNotSupportedException {
        return (Money)super.clone();
    }
}
public class Student implements Cloneable{
    int score;
    Money m;

    public Student(){
        score = 100;
        m = new Money();

    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        //this: m
        //this: score---int
        Student s = (Student)super.clone();
        s.m = m.clone();
        return s;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student();
        Student s2 = s1.clone();

        s1.m.d = 100.0;
    }
}
