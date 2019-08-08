package dp;

/**
 * @author ming
 * @date 2019/6/1 22:03
 */

import java.util.Arrays;

/**
 * 扑克牌中的顺子，抽象建模能力
 */
public class P61 {
    public static void main(String[] args){
        System.out.println(new P61().isContinuous(new int[]{1,3,0,5,0}));
    }

    public boolean isContinuous(int [] numbers) {
        if(numbers == null || numbers.length == 0){
            return false;
        }

        Arrays.sort(numbers);
        int numOfKing = 0;
        int numOfBlank = 0; //需要大王小王去补的空位数量

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 0){
                numOfKing++;
            }

            if(i != 0){
                if(numbers[i] == numbers[i-1] && numbers[i] != 0){
                    return false;
                }else if(numbers[i] - numbers[i - 1] > 1 && numbers[i-1] != 0){
                    numOfBlank += numbers[i] - numbers[i-1] -1;
                }
            }
        }
        return numOfKing >= numOfBlank;
    }
}
