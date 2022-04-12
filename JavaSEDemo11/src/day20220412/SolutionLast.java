package day20220412;

public class SolutionLast {
    class FirstUniqueChar{
        //方法1：若某个元素在字符串中首次出现和最后一次出现的位置相等，说明它是唯一的
        public int firstUniqChar2(String s) {
            int index = -1;
            for (int i = 0; i < s.length(); i++){
                if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                    index = i;
                    break;
                }
            }
            return index;
        }

        //方法2：用一个char型数组统计字符出现的次数，再遍历字符串找到第一个唯一的字符
        public int firstUniqChar1(String s) {
            int index = -1;
            char[] count = new char[256];
            for (int i = 0; i < s.length(); i++){
                count[s.charAt(i)]++;
            }

            for (int i = 0; i < s.length();i++){
                if (count[s.charAt(i)] == 1){
                    index = i;
                    break;
                }
            }

            return index;
        }

        //方法三：两重for循环遍历字符串，位置相同就不比较
        public int firstUniqChar(String s) {
            int index = -1;
            for (int i = 0; i < s.length(); i++){
                boolean flag = false;
                for (int j = 0; j < s.length(); j++){
                    if (i == j){
                        continue;
                    }
                    if (s.charAt(i) == s.charAt(j)){
                        flag = true;
                        break;
                    }
                }
                if (flag == false){
                    index = i;
                    break;
                }
            }

            return index;
        }
    }
}
