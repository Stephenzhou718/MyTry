package dp;

/**
 * @author ming
 * @date 2019/6/5 16:15
 */

/**
 * 把字符串转换成整数
 */
public class P67 {
    public static void main(String[] args){

    }

    public int StrToInt(String str){
        if(str.length() == 0 || str.equals("")){
            return 0;
        }

        boolean negative = false;
        char[] chars = str.toCharArray();
        if(chars[0] == '-'){
            negative = true;
        }

        int sum = 0;
        int i;
        if(negative){
            i = 1;
        }else {
            i = 0;
        }

        for(; i < str.length(); i++){
            if(chars[i] == '+'){
                continue;
            }

            if(chars[i] < 48 || chars[i] > 57){
                return 0;
            }

            sum = sum * 10 + chars[i] - 48;
        }


        return negative? -sum:sum;


    }
}
