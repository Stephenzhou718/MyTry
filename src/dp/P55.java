package dp;
import dp.TreeNode;
/**
 * @author ming
 * @date 2019/5/30 22:31
 */
public class P55 {
    public static void main(String[] args){

    }

    public int TreeDepth(TreeNode root){
        if(root == null){
            return 0;
        }

        return 1 + Math.max(TreeDepth(root.left), TreeDepth(root.right));
    }
}
