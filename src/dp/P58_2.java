package dp;

/**
 * @author ming
 * @date 2019/6/1 21:49
 */

/**
 * 反转部分字符串
 */
public class P58_2 {
    public static void main(String[] args){
        System.out.println(new P58_2().LeftRotateString("abcDEFGxyz", 3));
    }

    public String LeftRotateString(String str,int n) {
        if(str == null || str.length() == 0 || n < 0){
            return "";
        }

        int lenght = str.length();
        String s1 = str.substring(0, n);
        String s2 = str.substring(n, lenght);
        StringBuilder sb = new StringBuilder();
        sb.append(s2);
        sb.append(s1);
        return sb.toString();
    }

}
