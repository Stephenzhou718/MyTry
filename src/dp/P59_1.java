package dp;

/**
 * @author ming
 * @date 2019/6/7 22:21
 */

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 滑动窗口的最大值
 */
public class P59_1 {
    public  static void main(String[] args){

    }

    public ArrayList<Integer> maxInWindows(int[] num, int size){

        ArrayList<Integer> ret = new ArrayList<>();
        if(num == null){
            return ret;
        }

        LinkedList<Integer> indexDeque = new LinkedList<>();

        for(int i = 0; i < size - 1; i++){
            while (!indexDeque.isEmpty() && num[i] > num[indexDeque.getLast()]){
                indexDeque.removeLast();
            }
            indexDeque.addLast(i);
        }


        for (int i = size - 1; i < num.length; i++) {
            while (!indexDeque.isEmpty() && num[i] > num[indexDeque.getLast()]) {
                indexDeque.removeLast();
            }
            indexDeque.addLast(i);
            if (i - indexDeque.getFirst() + 1 > size) {
                indexDeque.removeFirst();
            }
            ret.add(num[indexDeque.getFirst()]);
        }
        return ret;

    }
}
