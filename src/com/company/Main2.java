package com.company;


import java.util.Scanner;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args){
        new Main2().go();
    }
    public void go(){
        // 获取输入数据
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int k = scanner.nextInt();
        String inputStringAfterProcess = inputString.substring(1,inputString.length()-1);

        //除去链表两边的括号
        StringTokenizer stringTokenizer = new StringTokenizer(inputStringAfterProcess, ",");
        StringBuilder stringBuilder = new StringBuilder();

        //把链表转换成字符串
        while (stringTokenizer.hasMoreTokens()){
            stringBuilder.append(stringTokenizer.nextToken());
        }

        String rString = stringBuilder.toString();


        if(k % inputStringAfterProcess.length() == 0 || k > inputStringAfterProcess.length()){
            System.out.println(inputString);
        }else {
            StringBuilder stringBuilder1 = new StringBuilder();
            for(int i = 1; i<= rString.length() / k; i++){
                String subS = rString.substring((i-1)*k,i*k);
                String reverse = reverseString(subS);
                stringBuilder1.append(reverse);
            }
            stringBuilder1.append(rString.substring(rString.length() - rString.length() % k, rString.length()));



            //把字符串转换回数组形式
            StringBuilder stringBuilder2 = new StringBuilder("[");
            for(int i = 0; i < stringBuilder1.length(); i++){
                stringBuilder2.append(stringBuilder1.charAt(i));
                stringBuilder2.append(",");
            }



            System.out.println(stringBuilder2.substring(0, stringBuilder2.length() - 1) + "]");

        }
    }

    private String reverseString(String s){
        String s1 = "";
        for(int i = s.length()-1; i>=0; i--){
            s1 += s.charAt(i);
        }
        return s1;
    }
}
