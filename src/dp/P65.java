package dp;

/**
 * @author ming
 * @date 2019/6/5 15:49
 */

/**
 * 求两数之和
 * 不能用 加号
 */
public class P65 {
    public static void main(String[] args){
        System.out.println(new P65().Add(5, 17));
    }

    public int Add(int num1, int num2){
        int sum, carry;
        do{
            sum = num1 ^ num2;
            carry = (num1 & num2) << 1;
            num1 = sum;
            num2 = carry;

        }while (num2 != 0);

        return num1;
    }
}
