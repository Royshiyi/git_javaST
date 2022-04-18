package day20220418;

import java.util.ArrayList;
import java.util.List;

public class YangHuiSolution {
    //力扣118
    public static List<List<Integer>> generate(int numRows){

        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0;i < numRows; ++i){
            //计算杨辉三角每行数据
            List<Integer> rowData = new ArrayList<>(i+1);
            for(int j = 0;j <= i;j++){
                if(0 == j || i == j){
                    rowData.add(1);
                }else{
                    //...
                    rowData.add(list.get(i-1).get(j) + list.get(i-1).get(j-1));
                }
            }
            list.add(rowData);
        }
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        generate(5);

    }


    /*public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0;i < numRows; i++){
            //计算杨辉三角每行数据
            List<Integer> rowData = new ArrayList<>(i + 1);
            for(int j = 0;j <= i;j++){
                if(0 == j || i == j){
                    rowData.add(1);
                }else{
                    //...
                    rowData.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
                }
            }
            list.add(rowData);
        }
        return list;
    }*/

}
