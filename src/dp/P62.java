package dp;

/**
 * @author ming
 * @date 2019/6/5 15:05
 */

/**
 * 圆圈中最后剩下的数字
 * 一共 n 个数字
 * 每次除去第 n 个数字
 * 求最后剩下的数字
 * 约瑟夫环问题
 */
public class P62 {
    public static void main(String[] args){

    }

    public int LastRemaining_Solution(int n, int m){
        if(n < 1 || m < 1){
            return -1;
        }

        int last = 0;
        for(int i = 2; i <= n; i++){
            last = (last + m) % i;
        }

        return last;
    }
}
