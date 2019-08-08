package dp;

/**
 * @author ming
 * @date 2019/6/5 20:24
 */

/**
 * 表示数值的字符串
 */
public class P20 {
    public static void main(String[] args){

    }

    public class Solution {
        public boolean isNumeric(char[] str) {
            String s=String.valueOf(str);
            //return s.matches("[+-]?[0-9]*(.[0-9]*)?([eE][+-]?[0-9]+)?");
            return s.matches("[+-]?[0-9]*(\\.[0-9]*)?([eE][+-]?[0-9]+)?");
        }
    }
}
