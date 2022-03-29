package GuessNumber;
import java.util.Random;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        int a = ra.nextInt(100) ;
        int times = 10;
        System.out.println("请输入你要猜的数字（1-100间的整数）：");
        while (times > 0) {
            int b = sc.nextInt();
            if (b > a) {
                System.out.println("大了");
            } else if (a == b) {
                System.out.println("恭喜你，猜对了");
                System.exit(0);
            } else{
                System.out.println("小了");
            }
            times--;
        }
        System.out.println("对不起，你的次数已用完，该数字是：" + a);
        sc.close();
        System.exit(0);

    }
}


