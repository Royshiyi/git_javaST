package day20210912;

public class Person {
    //注意：一般情况下，成员变量都设置为private
    private String name;
    private  String gender;
    private int age;

    public Person(String name,String gender,int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    //设置为private之后，别人就无法使用
    //给这些私有的成员提供set/getXXX的访问方式
    public void setAge(int age){
        this.age = age;



    }
    public int getAge(){
        return age;
    }

    //如果类中私有的成员比较多，自己写就太麻烦了
    //alt + insert / F12

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        /*return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';*/
        String s = "[";
        s += name;
        s += ",";
        s += gender;
        s += ",";
        s += age;
        return s;
    }

    public static void main(String[] args) {
        Person p = new Person("Hanmeimei","女",13);

        System.out.println(p);

        //如果要打印对象中的值
    }
}
