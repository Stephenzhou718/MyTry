package dp;

import java.util.Stack;

/**
 * @author ming
 * @date 2019/4/23 14:59
 */
public class P31 {
    /**
     * 栈的入栈、出栈序列
     * @param args
     */
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int[] b = {4,5,3,2,1};
        P31 p31 = new P31();
        System.out.println(p31.IsPopOrder(a, b));

    }

    private boolean IsPopOrder(int[] pushA, int[] popA){

        Stack<Integer> stack = new Stack<>();
        int pushAIndex = 0;
        for(int i = 0; i < popA.length; i++){
            while ((stack.isEmpty() || stack.peek() != popA[i]) && pushAIndex < pushA.length){
                stack.push(pushA[pushAIndex]);
                pushAIndex++;
            }

            if(stack.peek() == popA[i]){
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
