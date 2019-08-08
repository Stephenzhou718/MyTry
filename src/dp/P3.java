package dp;

/**
 * @author ming
 * @date 2019/6/5 16:29
 */

/**
 * 数组中重复的数字
 */
public class P3 {
    public static void main(String[] args){

    }

    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers == null || numbers.length == 0){
            return false;
        }

        for(int i = 0; i < numbers.length; i++){
            while (numbers[i] != i){
                if(numbers[i] == numbers[numbers[i]]){
                    duplication[0] = numbers[i];
                    return true;
                }

                swap(numbers, i, numbers[i]);
            }
        }
        return false;
    }

    public void swap(int numbers[], int i, int j){
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
