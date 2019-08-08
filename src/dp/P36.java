package dp;
import dp.TreeNode;
import sun.reflect.generics.tree.Tree;

/**
 * @author ming
 * @date 2019/5/13 20:26
 */
public class P36 {
     public void main(String[] args){

     }


    public TreeNode Convert(TreeNode pRootOfTree){
        if(pRootOfTree == null) return null;
        TreeNode last = ConvertNode(pRootOfTree, null);
        while (last!= null && last.left != null){
            last = last.left;
        }
        return last;
    }

    private TreeNode ConvertNode(TreeNode root, TreeNode last){
         if(root == null) return null;

         if(root.left != null){
             last = ConvertNode(root.left, last);
         }

         root.left = last;

         if(last != null){
             last.right = root;
         }

         last = root;

         if(root.right != null){
             last = ConvertNode(root.right, last);
         }

         return last;

    }
}
