package dp;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author ming
 * @date 2019/4/13 16:01
 */
public class Problem12 {
    /**
     * 图中找字符串匹配
     * @param args
     */
    public static void main(String[] args){
        System.out.println(new Problem12().go());
    }

    public boolean go(){
        Scanner scanner = new Scanner(System.in);
        String str0 = scanner.nextLine();
        String[] str = new String[str0.length()];
        for(int i = 0; i < str0.length(); i++){
            str[i] = String.valueOf(str0.charAt(i));
        }
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        String[] matrix = new String[rows * cols];
        int i = 0;
        while(scanner.hasNext()){
            matrix[i] = scanner.next();
            i++;
        }

        boolean[] isvisited = new boolean[rows * cols];
        Arrays.fill(isvisited,false);

        int pathLength = 0;

        for (int j = 0; j < rows; j++){
            for(int k = 0; k < cols; k++){
                if(hasPathCore(matrix, rows, cols, pathLength, j, k, str, isvisited)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean hasPathCore(String[] maxtrix, int rows, int cols, int pathLength, int row, int col, String[] str, boolean[] isVisited){
        if(str.length == 0){
            return true;
        }

        boolean hasPath = false;
        if(row >= 0 && row <rows && col >= 0 && col < cols && maxtrix[row * cols + col].equals(str[pathLength]) && !isVisited[row * cols + col]){
            pathLength++;
            isVisited[row * col + col] = true;

            hasPath = hasPathCore(maxtrix,rows,cols,pathLength,row + 1,col,str,isVisited)
                    || hasPathCore(maxtrix,rows,cols,pathLength,row - 1,col,str,isVisited)
                    || hasPathCore(maxtrix,rows,cols,pathLength,row,col + 1,str,isVisited)
                    || hasPathCore(maxtrix,rows,cols,pathLength,row,col - 1,str,isVisited);

            if(!hasPath){
                pathLength--;
                isVisited[row * cols + col] = false;
            }
        }

        return hasPath;
    }
}
