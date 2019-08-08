package dp;

import java.util.Scanner;

/**
 * @author ming
 * @date 2019/4/11 21:31
 */
public class dp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n) {
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                int[] dp = new int[n + 1];
                dp[0] = 0;
                dp[1] = 1;
                dp[2] = 2;
                dp[3] = 3;
                for (int i = 4; i < n + 1; i++) {
                    dp[i] = dp[i - 1] + dp[i - 2];
                }
                System.out.println(dp[n]);
        }


    }
}
