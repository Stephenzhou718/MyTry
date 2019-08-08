package dp;

/**
 * @author ming
 * @date 2019/6/1 21:35
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * 反转字符串，但是其中的单词不变
 */
public class P58 {
    public static void main(String[] args){
        System.out.println(new P58().ReverseSentence("I am a student."));
    }

    public String ReverseSentence(String str) {
        if(str == null || str.length() == 0){
            return "";
        }else if(str.trim().equals("")){
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        ArrayList<String> words = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens()){
            words.add(st.nextToken());
        }

        Collections.reverse(words);
        for(String word : words){
            sb.append(word + " ");
        }


        return sb.toString().substring(0, length);
    }
}
