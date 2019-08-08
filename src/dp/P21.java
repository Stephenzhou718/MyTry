package dp;

import java.util.Scanner;

/**
 * @author ming
 * @date 2019/4/18 18:14
 */
public class P21 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        int[] resultArray = new int[length];
        int begin = 0;
        int end = length - 1;

        for (int i = 0; i < length; i++){
            array[i] = scanner.nextInt();
        }

        for(int i = 0; i < length; i++){
            if(array[i] % 2 == 1){
                resultArray[begin] = array[i];
                begin++;
            }
        }

        for(int j = length - 1; j >= 0; j--){
            if(array[j] % 2 == 0){
                resultArray[end] = array[j];
                end--;
            }
        }

        for(int item : resultArray){
            System.out.println(item);
        }
    }
}
