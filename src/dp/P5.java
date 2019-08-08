package dp;

import java.util.Scanner;

/**
 * @author ming
 * @date 2019/4/17 11:01
 */
public class P5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StringBuffer sb = new StringBuffer(scanner.nextLine());
        StringBuffer newSb = new StringBuffer();
        for (int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) == ' '){
                newSb.append('%');
                newSb.append('2');
                newSb.append('0');
            }else {
                newSb.append(sb.charAt(i));
            }
        }

        System.out.println(newSb.toString());
    }
}
