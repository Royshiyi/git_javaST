package day20220411;

public class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[256];
        // 统计每个字符出现的次数
        for(int i = 0; i < s.length(); ++i){
            count[s.charAt(i)]++;
        }
        // 找第一个只出现一次的字符
        for(int i = 0; i < s.length(); ++i){
            if(1 == count[s.charAt(i)]){
                return i;
            }
        }
        return -1;
    }
}
