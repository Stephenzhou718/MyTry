package com.company;


import java.util.*;

public class Main {
    public static void main(String[] args){
        new Main().go();
    }
    public void go(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        String inputList = scanner.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(inputList, ",");
        while (stringTokenizer.hasMoreTokens()){
            arrayList.add(stringTokenizer.nextToken());
        }

        Set<String> mySet = new TreeSet<>();

        for(String s : arrayList){
            if(!mySet.contains(s)){
                mySet.add(s);
            }else {
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
}
