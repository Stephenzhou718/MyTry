package dp;

/**
 * @author ming
 * @date 2019/6/5 18:17
 */

import java.util.Arrays;
import java.util.Collections;

/**
 * 构建乘积数组
 */
public class P66 {
    public static  void main(String[] args){
        new P66().multiply(new int[]{1,2,3,4,5});
    }

    public int[] multiply(int[] A) {
        if(A == null || A.length == 0){
            return new int[0];
        }


        int[] C = new int[A.length];
        int[] D = new int[A.length];
        int[] R = new int[A.length];

        C[0] = 1;
        for (int i = 1; i < A.length; i++){
            C[i] = C[i-1] * A[i-1];
        }

        D[A.length - 1] = 1;
        for(int i = A.length - 2; i >= 0; i--){
            D[i] = D[i+1] * A[i+1];
        }

        for(int i = 0; i < A.length; i++){
            R[i] = C[i] * D[i];
        }

        return R;

    }

}
