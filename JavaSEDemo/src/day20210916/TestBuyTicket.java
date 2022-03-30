package day20210916;

public class TestBuyTicket {
    public static void testBuyTicket(Person p){
        p.buyTicket();
    }

    public static void main(String[] args) {
        Person p = new Person();
        Student stu = new Student();
        Soldier sol = new Soldier();

        testBuyTicket(p);
        testBuyTicket(stu);
        testBuyTicket(sol);

    }
}
