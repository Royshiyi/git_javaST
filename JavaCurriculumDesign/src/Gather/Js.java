package Gather;
import java.util.Scanner;

import Pcak1.PingMian;
import Pcak1.Rectangle;

public class Js {
    public static void main(String[] args) {
        int type;
        Scanner sc = new Scanner(System.in);
        try{
            do{
                System.out.println("请输入需要计算的几何图形：（长方形：1；圆：2；圆柱体：3；圆锥体：4；退出系统：0");
                type = sc.nextInt();
                if(type == 1){
                    System.out.println("请输入长方形的长：");
                    float length = sc.nextFloat();
                    System.out.println("请输入长方形的宽：");
                    float width = sc.nextFloat();

                }
            }
        }
    }
}
