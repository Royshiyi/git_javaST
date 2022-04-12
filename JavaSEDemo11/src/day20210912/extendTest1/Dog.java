package day20210912.extendTest1;


//狗是一个动物----只需要继承animal
//好处：重复的方法不需要自己再来实现，直接从父类中继承
//修饰符   class className  extends  父类名称

//Animal : 父类 或者 基类------》超类
//Dog : 子类  或者  派生类

/*注意：子类一定要进行扩展
* ------哪怕是增加一个成员变量也行*/
public class Dog extends Animal{
    public void bark(){
        System.out.println(name + "汪汪汪~~~~");
    }
}
