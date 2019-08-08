package dp;

import java.util.ArrayList;

/**
 * @author ming
 * @date 2019/6/1 21:21
 */
public class P57_2 {
    public static void main(String[] args){
        System.out.println(new P57_2().FindNumbersWithSum(new int[]{1,2,3,4,5}, 7));
    }

    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> result = new ArrayList<>();
        if(array == null || array.length < 2 || sum <= array[0]){
            return result;
        }


        int smallIndex = 0;
        int bigIndex = array.length -1;
        int currentSum = 0;

        while (smallIndex < bigIndex){
            currentSum = array[smallIndex] + array[bigIndex];
            if(currentSum == sum){
                result.add(array[smallIndex]);
                result.add(array[bigIndex]);
                return result;
            }else if(currentSum > sum){
                bigIndex--;
            }else {
                smallIndex++;
            }
        }

        return result;
    }
}
