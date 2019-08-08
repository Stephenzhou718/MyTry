package dp;

import java.util.Scanner;

/**
 * @author ming
 * @date 2019/4/18 16:32
 */
public class P16 {
    public static void main(String[] args){
       new P16().go();
    }

    private void go(){
        Scanner scanner = new Scanner(System.in);
        double base = scanner.nextDouble();
        int exponent = scanner.nextInt();
        double result = 0;
        if(base == 0){
            result = 1;
        }else if(exponent < 0){
            exponent = -exponent;
            result = myPow(base, exponent);
            result = 1/result;
        }else {
            result = myPow(base, exponent);
        }

        System.out.println(result);

    }
    private double myPow(double base, int exponent){
        if(exponent == 0){
            return 1;
        }

        if(exponent == 1){
            return base;
        }

        double result = myPow(base, exponent>>1);
        result = result * result;
        if((exponent & 0x1) == 1){
            result =  result * base;
        }
        return result;
    }
}
