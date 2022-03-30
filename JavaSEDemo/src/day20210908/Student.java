package day20210908;

public class Student {
    String name;
    String gender;
    int age;

    /*
    * 构造方法
    *   1.名字必须与类名相同
    *   2.没有返回值类型（void也不行）
    *       虽然语法代码可以通过编译，但是编译器不认为他是构造方法
    *       因为：在创建对象时，该方法没有执行
    *   3.调用时机：只有在创建对象时，有编译器自动调用，整个对象的生命周期只调用一次
    *       */
    public Student(){   //public void Student(){}
        System.out.println("我是构造方法");
    }

    //该构造方法中：使用三个形参对对象中的字段进行初始化
    public Student(String name,String gender,int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    public void SetStudentInfo(String name,String gender,int age){
        this.name = name;
        this.gender = gender;
        this.age = age;

    }
    public void printStudentInfo(){
        System.out.println(name + "," + gender + "," + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.SetStudentInfo("LILEI","男",13);
        s1.printStudentInfo();
        Student s2 = new Student();
        s2.SetStudentInfo("HANMEIMEI","女",12);
        s2.printStudentInfo();

        //上述代码分析问题每次都是将对象创建好之后然后才设置数据，有点繁琐
        //期望：对象在创建好之后能否将数据设置进去

        Student s3 = new Student("Jim","女",14);
        s3.printStudentInfo();
    }
}
