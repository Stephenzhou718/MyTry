package dp;

import java.awt.print.Pageable;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ming
 * @date 2019/4/14 11:02
 */
public class P13 {
     public static void main(String[] args){
         System.out.println(new P13().go());
     }
     private int go(){
         Scanner scanner = new Scanner(System.in);
         int k = scanner.nextInt();
         int rows = scanner.nextInt();
         int cols = scanner.nextInt();
         boolean[] visited = new boolean[rows * cols];
         Arrays.fill(visited,false);
         int count = movingCountCore(k,rows,cols,visited,0,0);
         return count;

     }

     private int movingCountCore(int k, int rows, int cols, boolean[] visited, int row ,int col){
         int count = 0;
         if(check(k,rows,cols,visited,row,col)){
             visited[row * cols + col] = true;
             count = 1 + movingCountCore(k,rows,cols,visited,row + 1,col) + movingCountCore(k,rows,cols,visited,row - 1,col) +
                     movingCountCore(k,rows,cols,visited,row,col + 1) + movingCountCore(k,rows,cols,visited,row,col - 1);
         }
         return count;
     }


     private boolean check(int k, int rows, int cols, boolean[] visited, int row, int col){
         if(row >= 0 && row < rows && col >= 0 && col < cols && !visited[row * cols + col] && getSum(row) + getSum(col) <= k){
             return true;
         }
         return false;
     }

     private int getSum(int number){
         int sum = 0;
         while(number > 0){
             sum += number % 10;
             number /= 10;
         }
         return sum;
     }
}
