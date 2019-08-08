package dp;

/**
 * @author ming
 * @date 2019/5/28 22:02
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * 把数组排成最小的数
 */
public class P45 {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 4,5,3};
        System.out.println(new P45().PrintMinNumber(numbers));
    }

    public String PrintMinNumber(int[] numbers) {
        if (numbers == null || numbers.length ==0){
            return "";
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int num : numbers){
            list.add(num);
        }

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = o1 + "" + o2;
                String s2 = o2 + "" + o1;

                return s1.compareTo(s2);
            }
        });


        StringBuilder sb = new StringBuilder();
        for(int num : list){
            sb.append(String.valueOf(num));
        }

        return sb.toString();
    }
}