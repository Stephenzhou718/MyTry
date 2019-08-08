package dp;

/**
 * @author ming
 * @date 2019/4/21 14:18
 */
public class MtTest {
    /**
     * 快速排序
     * @param args
     */
    public static void main(String[] args){
        int[] a = new int[]{3, 2, 4, 1, 5, 6, 9 ,8};
        new MtTest().sort(a, 0, a.length-1);
        for(int item : a){
            System.out.println(item);
        }
    }

    public void sort(int[] a, int lo, int hi){
        if(hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }

    public int partition(int[] a, int lo, int hi){
        int i = lo;
        int j = hi + 1;
        int v = a[lo];

        while (true){
            while(a[++i] < v) if(i == hi) break;
            while(a[--j] > v) if(j == lo) break;

            if(i >= j) break;
            exchange(a, i, j);
        }
        exchange(a, lo, j);
        return j;
    }

    public void exchange(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
