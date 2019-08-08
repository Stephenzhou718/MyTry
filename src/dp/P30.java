package dp;

import java.util.Stack;

/**
 * @author ming
 * @date 2019/4/22 21:45
 */
public class P30 {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    int min = Integer.MAX_VALUE;

    public void push(int node){
        stack.push(node);
        if(node < min){
            min = node;
        }
        minStack.push(min);
    }

    public void pop(){
        stack.pop();
        minStack.pop();
    }

    public int top(){
        return stack.peek();
    }

    public int min(){
        return minStack.peek();
    }
}
