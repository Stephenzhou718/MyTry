package dp;

/**
 * @author ming
 * @date 2019/5/30 22:53
 */

import java.util.HashMap;

/**
 * 数组中只出现一次的两个数字
 */
public class P56 {
    public static void main(String[] args){

    }

    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]){
            if(array == null || array.length < 2){
                return;
            }

            int temp = 0;
            for(int i = 0; i < array.length; i++){
                temp ^= array[i];
            }

            int indexOf1 = findFirstBit1s(temp);

            for(int i = 0; i < array.length; i++){
                if(isBit(array[i], indexOf1)){
                    num1[0] ^= array[i];
                }else {
                    num2[0] ^= array[i];
                }
            }



    }

    public int findFirstBit1s(int num){
        int indexBit = 0;
        while(((num & 1) == 0) && (indexBit <8*4) ){
            num = num >> 1;
            ++indexBit;
        }

        return indexBit;
    }

    public boolean isBit(int num, int indexBit){
        num = num >> indexBit;
        return (num & 1) == 1;
    }
}
