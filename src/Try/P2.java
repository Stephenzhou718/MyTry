package Try;

/**
 * @author ming
 * @date 2019/7/11 20:56
 * 1 到 n 的最大 n 个数
 */
public class P2 {
    public static void main(String[] args){

    }

    public void print1ToMaxOfNDigits(int n){
        if(n <= 0){
            return;
        }

        char[] number = new char[n];

    }

    private void print1ToMaxOfNDigits(char[] number, int digit){
        if(digit == number.length){

        }
    }

    private void printNumber(char[] number){
        int index = 0;
        while (index < number.length && number[index] == '0'){
            index++;
        }

        while (index < number.length){
            System.out.println(number[index++]);
        }

        System.out.println();
    }
}
