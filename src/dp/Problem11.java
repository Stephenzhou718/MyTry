package dp;

import com.company.Main;

import java.util.Scanner;

/**
 * @author ming
 * @date 2019/4/13 14:58
 */
public class Problem11 {
    public static void main(String[] args){
        System.out.println(new Problem11().go());

    }

    public int go(){
        //读取数据
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] c = s.split("\\s+");
        int[] number = new int[c.length];
        for(int i = 0; i < c.length; i++){
            number[i] = Integer.valueOf(c[i]);
        }

        int lo = 0;
        int hi = c.length - 1;
        int mid = 0;
        while(number[lo] >= number[hi]){
            if(lo == hi - 1){
                mid = hi;
                break;
            }

            mid = lo + (hi - lo) / 2;
            if(number[lo] == number[mid] && number[mid] == number[hi] && number[lo] == number[hi]){
                mid = findMin(number, lo, hi);
                break;
            }

            if(number[mid] >= number[lo]){
                lo = mid;
            }

            if(number[mid] <= number[hi]){
                hi = mid;
            }
        }

        return number[mid];
    }

    public int findMin(int[] array1,int lo, int hi){
        int min = Integer.MIN_VALUE;
        int minIndex = lo;
        for(int i = lo; i <= hi; i++){
            if(array1[i] < min){
                min = array1[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
