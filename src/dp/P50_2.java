package dp;

/**
 * @author ming
 * @date 2019/6/7 16:19
 */

import java.util.HashMap;
import java.util.LinkedList;

/**
 * 字符流中第一个只出现一次的字符
 */
public class P50_2 {
    public static void main(String[] args){
        P50_2 p = new P50_2();
        p.Insert('g');
        p.Insert('o');
        p.Insert('o');
        System.out.println(p.FirstAppearingOnce());
    }


    HashMap<Character, Integer> wordCount = new HashMap<>();
    LinkedList<Character> wordList = new LinkedList<>();

    public void Insert(char ch){
        if(this.wordCount.keySet().contains(ch)){
             wordCount.put(ch,0);
        }else {
            wordCount.put(ch, 1);
        }
        wordList.add(ch);
    }

    public char FirstAppearingOnce(){
        for(Character ch : wordList){
            if(wordCount.get(ch) == 1){
                return ch;
            }
        }
        return '#';
    }
}
