package dp;

/**
 * @author ming
 * @date 2019/5/30 22:17
 */

import java.util.HashMap;

/**
 * 一个数字在排序数组中的出现次数
 */
public class P53 {
    public static void main(String[] args){

    }

    public int GetNumberOfK(int[] array, int k){
        if(array == null || array.length == 0){
            return 0;
        }
        int count = 0;

        for(int num : array){
            if(num == k){
                count++;
            }
        }
        return count;
    }
}
