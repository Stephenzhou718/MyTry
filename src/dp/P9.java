package dp;

import java.util.Stack;

/**
 * @author ming
 * @date 2019/4/17 18:06
 */
public class P9 {
    public static void main(String[] args){

    }
}

class MyQueue{
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node){
        stack1.push(node);
    }

    public int pop(){
        if(stack2.isEmpty() && stack1.isEmpty()){
            return Integer.parseInt(null);
        }else if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }
}
