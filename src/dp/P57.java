package dp;

import java.util.ArrayList;

/**
 * @author ming
 * @date 2019/6/1 20:31
 */
public class P57 {
    public static void main(String[] args){
        System.out.println(new P57().FindContinuousSequence(100).toString());
    }

    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum){
        if(sum <= 0){
            return null;
        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int begin = 1;
        int end = 2;
        int currentSum = begin + end;
        while (begin < (sum+1) / 2){
            if(currentSum == sum){
                result.add(ContinuosSequence(begin, end));
                end += 1;
                currentSum += end;
            }else if(currentSum < sum){
                end += 1;
                currentSum += end;
            }else{
                currentSum -= begin;
                begin += 1;
            }
        }
        return result;

    }

    public ArrayList<Integer> ContinuosSequence(int begin, int end){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = begin; i <= end; i++){
            result.add(i);
        }
        return result;
    }
}
