package com.company;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main3 {
    public static void main(String[] args){
        new Main3().go();
    }
    public void go(){
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(inputString," ");
        int num = Integer.parseInt(stringTokenizer.nextToken());
        String[] layers = new String[num];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()){
            layers[i] = stringTokenizer.nextToken();
            i++;
        }

        int l = 0;
        for(int j = 0; j < i-1; j++){
            for(int k = 0; k < countLayer(layers[j]); k++){
                System.out.print("1");
            }
            System.out.print(" ");
            l = j;
        }
        for(int k = 0; k < countLayer(layers[l]); k++){
            System.out.print("1");
        }

    }

    public int countLayer(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '/'){
                count++;
            }
        }
        return count;
    }
}
