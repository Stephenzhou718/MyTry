package dp;

import java.util.Arrays;
import java.util.Scanner;


public class Main1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] input = new int[rows][cols];
        boolean[][] marked = new boolean[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                input[i][j] = scanner.nextInt();
                marked[i][j] = false;
            }
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(marked[i][j]) continue;
                if(j - 1 >= 0 && !marked[i][j-1] && ((input[i][j-1] == input[i][j]) || (input[i][j-1] != input[i][j-1]))){
                    marked[i][j-1] = true;
                }

                if(j + 1 < cols && !marked[i][j+1] && (input[i][j+1] == input[i][j])){
                    marked[i][j+1] = true;
                }

                if(i - 1 >= 0 && !marked[i-1][j] && (input[i-1][j] == input[i][j])){
                    marked[i-1][j] = true;
                }

                if(i + 1 < rows && !marked[i+1][j] && (input[i+1][j] == input[i][j])){
                    marked[i+1][j] = true;
                }
            }
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(marked[i][j]){
//                    System.out.println(i + " : " + j);
                    count++;
                }
            }
        }

        System.out.println(count);



    }
}
