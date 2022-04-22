package day20220420;

//不带头结点的单链表
public class SingleLinkedList<E> {

    public static class Node<E>{
        E value;
        Node<E> next;
        public Node(E value) {
            this.value = value;
        }
    }
    Node<E> head;   //head将来指向链表中的第一个有效结点


    /*//头插法
    public void addFirst(int data);
    //尾插法
    public void addLast(int data);
    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data);
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key);
    //删除第一次出现关键字为key的节点
    public void remove(int key);
    //删除所有值为key的节点
    public void removeAllKey(int key);
    //得到单链表的长度*/
    public int size(){
        Node cur = head;
        int count = 0;
        while(null != cur){
            count++;
            cur = cur.next;
        }

        return count;
    }
        //将链表中每个结点的值域拼接成一个字符串返回
    /*public void toString(){
        Node cur = head;
        String  str = "[";
        while(null != cur){
            str += cur.value;
            str += ",";
            cur = cur.next;
        }


    }
    public void clear();*/
}

