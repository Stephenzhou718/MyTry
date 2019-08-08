package dp;
import java.util.*;

/**
 * @author ming
 * @date 2019/5/25 20:53
 */
public class P40 {
    public static void main(String[] args){
        new P40().GetLeastNumbers_Solution(new int[]{5,6,7,8,5,5}, 4);
    }

    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k){
        //代码的鲁棒性一定要做好
        if(input == null || k == 0 || k > input.length){
            return null;
        }

        ArrayList<Integer> result = new ArrayList<>();

        PriorityQueue<Integer> leastNum = new PriorityQueue<>();
        for(int i = 0; i < input.length; i++){
            leastNum.offer(input[i]);
        }

        for (int i = 0; i < k; i++){
            result.add(leastNum.poll());
        }
        return result;
    }

}
