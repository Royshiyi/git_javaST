package day20220412;

public class SolutionTest {
    public static void main(String[] args) {
        String str = "abbccaddgh";
        int start, end;
        char ch;

        for (int i = 0; i < str.length(); i++) {

            ch = str.charAt(i);
            start = str.indexOf(ch);
            end = str.lastIndexOf(ch);

            if (start == end) {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }

}
