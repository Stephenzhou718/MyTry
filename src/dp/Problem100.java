package dp;

import java.util.Scanner;

/**
 * @author ming
 * @date 2019/4/12 11:33
 */
public class Problem100 {
    /**
     * 一个数的二进制表示中 1 的个数
     * @param args
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();

        int count = 0;
        while(m != 0){
            m = m & (m-1);
            count++;
        }
        System.out.println(count);
    }
}
