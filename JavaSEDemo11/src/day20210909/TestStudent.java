package day20210909;

public class TestStudent {
    public static void main(String[] args) {
        //编译失败，因为classRoom在Student是private的
        Student.getclassRoom();

        Student s = new Student("111","男",13);
        s.printStudentInfo();
        s.getclassRoom();
    }
}

