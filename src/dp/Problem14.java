package dp;

import java.util.Scanner;

/**
 * @author ming
 * @date 2019/4/13 16:24
 */
public class Problem14 {
    /**
     * 剪绳子问题
     * @param args
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] dp = new int[n + 1];
        int maxLength = 0;
        switch (n){
            case 0:
                maxLength = 0;
                break;
            case 1:
                maxLength = 1;
                break;
            case 2:
                maxLength = 1;
                break;
            case 3:
                maxLength = 2;
                break;
                default:
                    dp[0] = 0;
                    dp[1] = 1;
                    dp[2] = 2;
                    dp[3] = 3;

                for(int i = 4; i< n + 1; i++){
                    int max = 0;
                    for(int j = 1; j <= i/2;j++){
                        if(dp[j] * dp[i - j] > max){
                            max = dp[j] * dp[i - j];
                        }
                        dp[i] = max;
                    }
                }
                maxLength = dp[n];
        }

        System.out.println(maxLength);
    }
}
