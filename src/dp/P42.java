package dp;

/**
 * @author ming
 * @date 2019/5/25 21:07
 */
public class P42 {
    public static void main(String[] args){

    }

    public int FindGreatestSumOfSubArray(int[] array){
        //做好鲁棒性检测
        if(array == null || array.length == 0){
            return 0;
        }

        int maxSum = Integer.MIN_VALUE;
        int temp = 0;

        for(int i = 0; i < array.length; i++){
            if(temp <= 0){
                temp = array[i];
            }else {
                temp += array[i];
            }

            if(temp > maxSum){
                maxSum = temp;
            }
        }

        return maxSum;
    }



}
