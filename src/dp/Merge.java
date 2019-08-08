package dp;

/**
 * @author ming
 * @date 2019/4/22 8:08
 */
public class Merge {
    /**
     * 归并排序
     */
    static int[] a;
    static int[] aux ;
    public static void main(String[] args){
        a = new int[]{6,2,7,3,4,5,9,1,8};
        aux = new int[a.length];
        new Merge().sort(a, 0, a.length -1);
        for(int item : a){
            System.out.println(item);
        }
    }


    private void sort(int[] a, int lo, int hi){
        if(hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid+1, hi);
        merge(a, lo, mid, hi);
    }

    private void merge(int[] a, int lo, int mid, int hi){
        //将 a[lo...mid] 和 a[mid+1....hi]合并
        int i = lo, j = mid + 1;
        for(int k = lo; k <= hi; k++){
            aux[k] = a[k];
        }

        for(int k = lo; k <= hi; k++ ){
            if(i > mid) a[k] = aux[j++];
            else if(j > hi) a[k] = aux[i++];
            else if(a[j] < a[i]) a[k] = aux[j++];
            else a[k] = aux[i++];

        }
    }
}
