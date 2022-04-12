package day20210909;

public class Student {
    //普通成员变量————实例成员变量----将来会处在每个对象中
    String name;
    String gender;
    int age;

    //类成员变量--静态成员变量————不会在具体的对象中存放的
    private static String classRoom = "Bit305";

    public Student(String name,String gender,int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public static String getclassRoom(){
        return classRoom;
    }
    public void printStudentInfo(){
        System.out.println(name + "," + gender + "," + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Lilei","男",13);
        Student s2 = new Student("HanMeiMei","女",12);
        Student s3 = new Student("Jim","男",14);
        /*s1.printStudentInfo();
        s2.printStudentInfo();
        s3.printStudentInfo();*/

        //静态成员变量没有存储在具体的对象中，是所有对象共享的
        System.out.println(s1.classRoom.hashCode());
        System.out.println(s2.classRoom.hashCode());
        System.out.println(s2.classRoom.hashCode());

        //静态成员变量可以通过对象访问，也可以直接通过类访问
        //更推荐通过类名.静态成员变量
        System.out.println(Student.classRoom);
        System.out.println(Student.classRoom.hashCode());

    }
}
