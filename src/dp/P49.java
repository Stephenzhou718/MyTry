package dp;

/**
 * @author ming
 * @date 2019/5/28 22:43
 */

/**
 * 丑数
 * 根据现有的数来推出新数
 */
public class P49 {
    public static void main(String[] args){
        System.out.println(new P49().GetUglyNumber_Solution(1500));
    }

    public int GetUglyNumber_Solution(int index){
        //鲁棒性
        if(index <= 0){
            return 0;
        }

        int[] uglyNumbers = new int[index];
        int count = 0;
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;

        uglyNumbers[0] = 1;
        int tmp = 0;

        while (count < index-1){
            tmp = Math.min(uglyNumbers[i2] * 2, Math.min((uglyNumbers[i3] * 3), uglyNumbers[i5] * 5));
            if(tmp == uglyNumbers[i2] * 2) ++i2;
            if(tmp == uglyNumbers[i3] * 3) ++i3;
            if(tmp == uglyNumbers[i5] * 5) ++i5;
            uglyNumbers[++count] = tmp;
        }

        return uglyNumbers[index-1];
    }


}
