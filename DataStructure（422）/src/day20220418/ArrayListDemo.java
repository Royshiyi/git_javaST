package day20220418;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo<E> {
    private Object[] array;
    private int size;
    //构造方法
    public ArrayListDemo(Object[] array, int size) {
        this.array = array;
        this.size = size;
    }

    public ArrayListDemo(int initCapacity){
        if(initCapacity > 0){
            array = new Object[initCapacity];
        }else if(initCapacity == 0){
            array = new Object[0];
        }else{
            throw new IllegalArgumentException("初始容量为负数");
        }
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return 0 == size;
    }
    // 尾插
    public boolean add(E e){
        ensureCapacity(size+1);
        array[size++] = e;
        return true;
    }
    // 为指定位置插入元素e
    public void add(int index, E e){
        rangeCheckForAdd(index);
        ensureCapacity(size+1);
        // 将index及其以后的元素统一往后搬移一个位置
        for (int i = size-1; i >= index; i--) {
            array[i+1] = array[i];
        }
        array[index] = e;
        size++;
    }
    // 删除index位置上元素
    public E remove(int index){
        rangeCheck(index);
        E e = (E)array[index];
        // 将index之后的元素统一往前搬移一个位置
        for(int i = index+1; i < size; ++i){
            array[i-1] = array[i];
        }
        size--;
        return e;
    }
    // 如果o存在，则删除
    public boolean remove(Object o){
        int index = indexOf(o);
        if(index == -1){
            return false;
        }
        remove(index);
        return true;
    }
    // 检测下标是否异常
    private void rangeCheck(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("下标越界");
        }
    }
    // 检测插入时下标是否异常
    private void rangeCheckForAdd(int index){
        if(index > size){
            throw new IllegalArgumentException("add下标越界");
        }
    }
    // 获取index位置上的元素
    public E get(int index){
        rangeCheck(index);
        return (E)array[index];
    }
    // 将index位置上元素设置为e
    public E set(int index, E e){
        rangeCheck(index);
        array[index] = e;
        return e;
    }
    // 清空
    public void clear(){
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }
    // 获取o第一次出现的位置
    public int indexOf(Object o){
        if(null == o){
            for (int i = 0; i < size; i++) {
                if(array[i] == null){
                    return i;
                }
            }
        }else{
            for (int i = 0; i < size; i++) {
                if(array[i].equals(o)){
                    return i;
                }
            }
        }
        return -1;

    }
    // 获取o最后一次吹an的位置
    int lastIndexOf(Object o){
        if (o == null) {
            for (int i = size-1; i >= 0; i--)
                if (array[i]==null)
                    return i;
        } else {
            for (int i = size-1; i >= 0; i--)
                if (o.equals(array[i]))
                    return i;
        }
        return -1;
    }
    // 检测o是否存在
    public boolean contains(Object o){
        return indexOf(o) > 0;
    }
    // 获取[fromIndex, toIndex)的一个子序列
    ArrayList<E> subList(int fromIndex, int toIndex){
        if(toIndex - fromIndex < 0){
            throw new IllegalArgumentException("参数非法");
        }
        ArrayList<E> list = new ArrayList<>(toIndex-fromIndex);
        for(int i = fromIndex; i < toIndex; ++i){
            list.add((E)array[i]);
        }
        return list;
    }
    // 扩容
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE-8;
    private void ensureCapacity(int initCapacity){
        int oldCapacity = array.length;
        int newCapacity = oldCapacity + (oldCapacity>>1);
        if(newCapacity < initCapacity){
            newCapacity = initCapacity;
        }
        if(newCapacity > MAX_ARRAY_SIZE){
            newCapacity = MAX_ARRAY_SIZE;
        }
        array = Arrays.copyOf(array, newCapacity);
    }
    @Override
    public String toString() {
        String s = "[";
        if(size > 0){
            for (int i = 0; i < size-1; i++) {
                s += array[i];
                s += ", ";
            }
            s += array[size-1];
        }
        s += "]";
        return s;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(3);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println(arrayList.size());
        System.out.println(arrayList);
        arrayList.add(0,0);
        if(arrayList.contains(5)){
            arrayList.add(5);
        }
        arrayList.add(0);
        System.out.println(arrayList);
        System.out.println(arrayList.indexOf(0));
        System.out.println(arrayList.lastIndexOf(0));
        arrayList.remove(0);
        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList);
    }
}


