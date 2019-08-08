package dp;

import java.util.Scanner;

/**
 * @author ming
 * @date 2019/4/11 21:26
 */
public class dp1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] flps = new int[n];
        switch (n){
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
                break;
                default:
                    flps[0] = 0;
                    flps[1] = 1;

                    for(int i = 2; i < n; i++){
                        flps[i] = flps[i - 1] + flps[i - 2];
                    }

                    System.out.println(flps[n - 1]);

        }

    }
}
