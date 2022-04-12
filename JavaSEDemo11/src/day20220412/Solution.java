package day20220412;

public class Solution {
    public int firstUniqChar(String s) {
        int[] table = new int[26];
        // 先用 toCharArray 转成 char 数组，反复调用 charAt 会浪费时间
        char[] arr = s.toCharArray();
        // 用 int[] 来做 hash table 就可以，节省空间
        for (char c : arr) {
            table[c - 97]++;
        }
        // 只要碰到 hash table 里出现只有一次的直接返回 i，否则就返回 -1
        for (int i = 0; i < s.length(); i++) {
            if (table[arr[i] - 97] == 1) return i;
        }
        return -1;
    }
}
