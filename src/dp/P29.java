package dp;

import java.util.ArrayList;

/**
 * @author ming
 * @date 2019/4/22 21:29
 */
public class P29 {
    /**
     * 顺时针打印矩阵
     * @param args
     */
    public static void main(String[] args){

    }

    private ArrayList<Integer> printMatrix(int[][] matrix){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int start = 0;
        while (cols > start * 2 && rows >= start * 2){
            printNumber(arrayList, matrix, rows, cols, start);
            start++;
        }
        return arrayList;

    }

    private void printNumber(ArrayList arrayList, int[][] matrix, int rows, int cols, int start){
        int endX = cols - start - 1;
        int endY = rows - start - 1;

        for(int i = start; i <= endX; ++i){
            arrayList.add(matrix[start][i]);
        }

        if( start < endY){
            for(int i = start+1; i <= endY; ++i){
                arrayList.add(matrix[i][endX]);
            }
        }

        if(start < endX && start < endY){
            for(int i = endX - 1; i >= start; --i){
                arrayList.add(matrix[endY][i]);
            }
        }

        if(start < endX && start < endY - 1){
            for(int i = endY - 1; i >= start + 1; --i){
                arrayList.add(matrix[i][start]);
            }
        }
    }
}
