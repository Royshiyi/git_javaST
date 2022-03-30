package day20210908;

public class Dog {
    public String name;
    private double price;
    String color;  //color 的访问权限就是默认的；即default

    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.name);
        System.out.println(d.price);
        System.out.println(d.color);
    }
}
