package dp;

/**
 * @author ming
 * @date 2019/4/24 21:08
 */
public class P33 {
    public static void main(String[] args){

    }

    private boolean VerifySequenceOfBST(int[] sequence){
        return isTreeBST(sequence, 0, sequence.length - 1);
    }

    private boolean isTreeBST(int[] sequence, int begin, int end) {
        if (begin <= end) return true;
        int root = sequence[end];
        int i = begin;
        for (; i < end; i++) {
            if (sequence[i] > root) break;
        }

        int j = i;
        for(; j < end; j++){
            if(sequence[j] < root) return false;
        }

        return isTreeBST(sequence, begin, i-1) && isTreeBST(sequence, i, end - 1);
    }
}
