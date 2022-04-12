package day20220411;

public class Solution1 {
    public static boolean isValidChar(char ch){
        if((ch >= 'a' && ch <= 'z') ||
                (ch >= '0' && ch <= '9')){
            return true;
        }
        return false;
    }

    public boolean isPalindrome(String s) {
        // 将大小写统一起来
        s = s.toLowerCase();
        int left = 0, right = s.length()-1;
        while(left < right){
            // 1. 从左侧找到一个有效的字符
            while(left < right && !isValidChar(s.charAt(left))){
                left++;
            }
            // 2. 从右侧找一个有效的字符
            while(left < right && !isValidChar(s.charAt(right))){
                right--;
            }
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
}