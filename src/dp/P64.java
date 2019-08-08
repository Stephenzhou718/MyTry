package dp;

/**
 * @author ming
 * @date 2019/6/5 15:44
 */

/**
 * 特殊方法 求 1 - n 的和
 */
public class P64 {
    public static void main(String[] args){
        System.out.println(new P64().Sum_Solution(4));
    }

    public int Sum_Solution(int n){
        if(n < 1){
            return -1;
        }else if(n == 1){
            return 1;
        }else{
            return n + Sum_Solution(n - 1);
        }
    }
}
