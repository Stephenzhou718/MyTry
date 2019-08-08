package dp;

/**
 * @author ming
 * @date 2019/5/29 16:15
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 第一个只出现一次的字符
 */
public class P50 {
    public  static void main(String[] args){
        System.out.println(new P50().FirstNotRepeatingChar("abcde"));
    }

    public int FirstNotRepeatingChar(String str){
        if (str == null || str.length() == 0){
            return -1;
        }

        char[] chars = str.toCharArray();
        HashMap<Character, Integer> word_frequency= new HashMap<>();
        ArrayList<Character> wordList = new ArrayList<>();

        for(int i = 0; i < chars.length; i++){
            if(word_frequency.keySet().contains(chars[i])){
                word_frequency.put(chars[i], word_frequency.get(chars[i]) + 1);
            }else {
                word_frequency.put(chars[i], 1);
                wordList.add(chars[i]);
            }
        }

        for(char c : wordList){
            if(word_frequency.get(c) == 1){
                return new String(chars).indexOf(c);
            }
        }
        return -1;
    }
}
