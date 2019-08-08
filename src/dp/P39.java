package dp;

/**
 * @author ming
 * @date 2019/5/25 20:20
 */

import java.util.ArrayList;

/**
 *  超过数组容量一般的数：抵消法
 */

public class P39 {
    public static void main(String[] args){
        int[] array = new int[]{1,2,3,2,2,2,5,4};
        System.out.println(new P39().MoreThanHalfNum_Solution(array));
    }

     public int MoreThanHalfNum_Solution(int[] array){
        // 一定要注意函数的鲁棒性，规定不符合要求的时候返回 0
        if(array == null || array.length == 0){
            return 0;
        }


        int num = -1;
        int count = 0;
        int times = 0;

        for(int i = 0; i < array.length; i++){
            if(num == -1 || count == 0){
                num = array[i];
                count++;
            }else if(array[i] != num){
                count--;
            }else if(array[i] == num){
                count++;
            }
        }

        for(int i = 0; i < array.length; i++){
            if(num == array[i]){
                times += 1;
            }
        }

        if(times > array.length / 2){
            return num;
        }
        return 0;
    }
}
