package dp;

/**
 * @author ming
 * @date 2019/5/14 22:21
 */

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * 字符串的排列
 */
public class P38 {

    public static  void main(String[] args){
        for (String str : new P38().Permutation("abc")){
            System.out.println(str);
        }
    }

    public ArrayList<String> Permutation(String str){
        ArrayList<String> result = new ArrayList<>();
        if(str == null || str.length() == 0) return result;
        TreeSet<String> temp = new TreeSet<>();
        Permutation(str.toCharArray(), 0, temp);
        result.addAll(temp);
        return result;


    }

    void Permutation(char[] chars, int begin, TreeSet<String> result){
        if(chars == null || chars.length == 0 || begin < 0 || begin > chars.length - 1) return;
        if(begin == chars.length - 1){
            result.add(String.valueOf(chars));
        }else {
            for(int i = begin; i < chars.length; i++){
                swap(chars, begin, i);
                Permutation(chars, begin + 1, result);
                //交换字符之后再换回来，这样可以进行下次交换
                swap(chars, begin, i);
            }
        }
    }

    void swap(char[] chars, int i, int j){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
