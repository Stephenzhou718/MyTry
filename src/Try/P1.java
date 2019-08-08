package Try;

import java.util.ArrayList;

/**
 * @author ming
 * @date 2019/7/11 19:39
 * 顺时针打印矩阵
 */
public class P1 {
    public static void main(String[] args){

        for(int i : new P1().new Solution().printMatrix(new int[][]{{1},{2},{3},{4},{5}})){
            System.out.println(i);
        }
    }

    public class Solution {
        public ArrayList<Integer> printMatrix(int [][] matrix) {
            ArrayList<Integer> ret = new ArrayList<>();
            if(matrix == null || matrix.length == 0){
                return ret;
            }

            int top = 0, down = matrix.length - 1, left = 0, right = matrix[0].length - 1;

            while (top <= down && left <= right){
                for(int i = left; i <= right; i++){
                    ret.add(matrix[top][i]);
                }

                if(top < down){
                    for(int i = top + 1; i <= down; i++){
                        ret.add(matrix[i][right]);
                    }
                }

                if(left < right && top < down){
                    for(int i = right - 1; i >= left; i--){
                        ret.add(matrix[down][i]);
                    }
                }

                if(top + 1 < down && left < right){
                    for(int i = down - 1; i > top; i--){
                        ret.add(matrix[i][left]);
                    }
                }

                top++;
                down--;
                left++;
                right--;
            }
            return ret;
        }
    }
}
