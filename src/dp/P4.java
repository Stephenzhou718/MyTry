package dp;

import java.util.Scanner;

/**
 * @author ming
 * @date 2019/4/17 10:18
 */
public class P4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] array = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                array[i][j] = scanner.nextInt();
            }
        }

        int row = 0;
        int col = cols - 1;
        boolean has = false;
        while (row < rows && col >= 0){
            if(array[row][col] == target){
                has = true;
                break;
            }else if(array[row][col] > target){
                col--;
            }else {
                row++;
            }
        }
        System.out.println(has);



    }
}
