package dp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Main {
    //树的最大深度问题
    public static void main(String[] args){
        new Main().go();
    }
    private void go(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<Integer, ArrayList<Integer>> seats = new HashMap<>();

        switch (n){
            case 0:
                System.out.println(0);
                break;
            case 1:
                int value0 = scanner.nextInt();
                System.out.println(1);
                break;
            case 2:
                int value1 = scanner.nextInt();
                int key1 = scanner.nextInt();

                System.out.println(1);
                break;
                default:
                    //读入位置数据
                    int begin = 0;
                    for(int i = 0; i < n-1; i++){
                        // value 接在 key 后面
                        int value = scanner.nextInt();
                        int key = scanner.nextInt();

                        if(i == 0){
                            begin = key;
                        }

                        if(seats.containsKey(key)){
                            seats.get(key).add(value);
                        }else {
                            seats.put(key,new ArrayList());
                            seats.get(key).add(value);
                        }
                    }
//        System.out.println(seats);

                    System.out.println(computeTime(seats,begin));

        }
    }

    int computeTime(HashMap<Integer, ArrayList<Integer>> map, int key){
        if(!map.containsKey(key)){
            return 1;
        }

        int max = 0;
        for(int value : map.get(key)){
            int times = computeTime(map,value);
            if(times > max){
                max = times;
            }
        }

        return 1 + max;
    }
}
