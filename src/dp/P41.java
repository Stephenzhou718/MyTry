package dp;

/**
 * @author ming
 * @date 2019/6/7 21:54
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 一个数据流中的中位数
 */
public class P41 {
    public static void main(String[] args){

    }
    ArrayList<Double> result = new ArrayList<>();
    int count = 0;
    public void Insert(Integer num){
        count += 1;
        result.add(Double.valueOf(num));
    }

    public Double GetMedian(){
        Collections.sort(result);
        if(count % 2 == 0){
            Double n1 = result.get(count / 2 - 1);
            Double n2 = result.get(count / 2);
            double a = Double.valueOf(n1 + "") + Double.valueOf(n2 + "");
            return a / 2;
        }else {
            Double n1 = result.get(count / 2);
            return Double.valueOf(n1 + "");
        }
    }
}
