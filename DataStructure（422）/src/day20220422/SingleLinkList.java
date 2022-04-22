package day20220422;

import java.util.Stack;

// 不带头结点的单链表
public class SingleLinkList<E> {
    public static class Node<E>{
        E value;
        Node<E> next;

        public Node(E value) {
            this.value = value;
        }
    }

    Node<E> head;   // head将来指向链表中的第一个有效节点

    //尾插法
    public void addLast(E data){
        Node<E> newNode = new Node(data);

        if(head == null){
            head = newNode;
        }else{
            // 1. 找最后一个结点
            Node<E> cur = head;
            while(null != cur.next){
                cur = cur.next;
            }

            // 2. 插入新结点
            cur.next = newNode;
        }


        /*
        // 1. 找最后一个结点
        Node cur = head;
        Node pre = null;
        while(null != cur){
            pre = cur;
            cur = cur.next;
        }

        // 2. 插入新结点
        pre.next = newNode;
        */
    }

    //头插法
    public void addFirst(E data){
        Node<E> newNode = new Node(data);

        /*
        // 这里的代码也是头插
        if(null == head){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        */

        newNode.next = head;
        head = newNode;
    }

    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int position, E data){
        // 1. 检测测试是否合法
        if(position < 0 || position >= 4){
            throw new IllegalArgumentException("addIndex:position非法");
        }

        if(0 == position){
            addFirst(data);
            return true;
        }

        // 2. 找到index位置的结点，并保存其前一个
        Node<E> cur = head;
        Node<E> prev = null;
        while(0 != position){
            prev = cur;
            cur = cur.next;
            position--;
        }

        // 3. 插入新节点
        Node<E> newNode = new Node<>(data);
        newNode.next = cur;
        prev.next = newNode;

        return true;
    }

    //删除第一次出现关键字为key的节点
    public void remove(E e){
        Node<E> cur = head;
        Node<E> prev = null;

        while(cur != null){
            if(e.equals(cur.value)){
                // 删除节点
                // 注意：可能删除的是第一个节点，也可能是其他节点
                cur.value = null;
                if(prev == null){
                    // 删除第一个节点
                    head = cur.next;
                }else{
                    // 删除非第一个节点
                    prev.next = cur.next;
                }
                return;
            }

            prev = cur;
            cur = cur.next;
        }
    }

    //删除所有值为key的节点
    public void removeAllKey(E e){
        /*
        // O(N^2)
        while (contains(e)){
            remove(e);
        }
        */

        Node<E> cur = head;
        Node<E> prev = null;
        while(cur != null){
            if(e.equals(cur.value)){
                // 删除节点
                cur.value = null;
                if(prev == null){
                    head = cur.next;
                    cur = head;
                }else{
                    prev.next = cur.next;
                    cur = prev.next;
                }
            }else{
                prev = cur;
                cur = cur.next;
            }
        }
    }

    //查找是否包含关键字e是否在单链表当中
    public boolean contains(E e){
        Node<E> cur = head;
        while (null != cur){
            if(e.equals(cur.value)){
                return true;
            }

            cur = cur.next;
        }

        return false;
    }

    //得到单链表的长度
    public int size(){
        Node<E> cur = head;
        int count = 0;
        while(null != cur){
            count++;
            cur = cur.next;
        }

        return count;
    }

    // 将链表中每个节点值域拼接成一个字符串返回
    public String toString(){
        Node<E> cur = head;
        String str = "[";
        while(null != cur){
            str += cur.value;
            if(null != cur.next){
                str += ",";
            }

            cur = cur.next;
        }

        str += "]";
        return str;
    }

    /*
    public void clear();
    */


    public static void testSingleLinkList1(){
        SingleLinkList<Integer> s = new SingleLinkList<>();
        s.addLast(0);
        s.addLast(1);
        s.addLast(2);
        s.addLast(3);
        s.addLast(4);
        s.addLast(5);
        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.contains(3));
        System.out.println(s.contains(0));
    }

    public static void testSingleLinkList2(){
        SingleLinkList<Integer> s = new SingleLinkList<>();
        s.addFirst(0);
        s.addFirst(1);
        s.addFirst(2);
        s.addFirst(3);
        s.addFirst(4);
        System.out.println(s);
    }


    public static void testSingleLinkList3(){
        SingleLinkList<Integer> s = new SingleLinkList<>();
        s.addLast(0);
        s.addLast(1);
        s.addLast(2);
        s.addLast(3);
        s.addLast(4);
        System.out.println(s);

        s.addIndex(3, 10);
        System.out.println(s);

        s.addIndex(0, 10);
        System.out.println(s);

        s.addIndex(100, 10);
        System.out.println();
    }

    public static void testSingleLinkList4() {
        SingleLinkList<Integer> s = new SingleLinkList<>();
        s.addLast(2);
        s.addLast(2);
        s.addLast(1);
        s.addLast(2);
        s.addLast(3);
        s.addLast(4);
        s.addLast(2);

        System.out.println(s);

        s.remove(2);
        System.out.println(s);

        s.removeAllKey(2);
        System.out.println(s);
    }

    ///////////////////////////////////////////////////////
    public  void printReverse(Node<E> head){
        if(null == head){
            return;
        }


        printReverse(head.next);
        System.out.print(head.value + " ");
    }

    public void printReverseNor(Node<E> head){
        if(head == null){
            return;
        }

        // 依次将链表中的元素保存到栈中
        Stack<E> s = new Stack<>();
        Node<E> cur = head;
        while(cur != null){
            s.push(cur.value);
            cur = cur.next;
        }

        // 将栈中的元素依次删除掉
        while(!s.empty()){
            System.out.print(s.pop() + " ");
        }
        System.out.println();
    }

    public static void testSingleLinkList5(){
        SingleLinkList<Integer> s = new SingleLinkList<>();
        s.addLast(0);
        s.addLast(1);
        s.addLast(2);
        s.addLast(3);
        s.addLast(4);
        System.out.println(s);

        s.printReverse(s.head);
        System.out.println();
        System.out.println(s);

        s.printReverseNor(s.head);
    }

    public static void main(String[] args) {
        // testSingleLinkList2();
        // testSingleLinkList3();
        // testSingleLinkList4();

        testSingleLinkList5();
    }
}
