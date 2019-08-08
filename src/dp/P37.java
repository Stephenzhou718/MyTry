package dp;

/**
 * @author ming
 * @date 2019/6/7 21:02
 */

import sun.reflect.generics.tree.Tree;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 序列化和反序列化二叉树
 */
public class P37 {
    public static void main(String[] args){
        TreeNode root = new P37().Deserialize("8,61057911");
    }

    /**
     * 序列化二叉树
     * @param root
     * @return
     */
    String Serialize(TreeNode root){
        if (root == null){
            return "";
        }

        StringBuilder sb = new StringBuilder();
        SerializeCore(root, sb);
        return sb.toString();
    }

    void SerializeCore(TreeNode root, StringBuilder result){
        if(root == null){
            result.append("#,");
            return;
        }else {
            result.append(root.val);
            result.append(",");
            SerializeCore(root.left, result);
            SerializeCore(root.right, result);
        }

    }

    /**
     * 反序列化二叉树
     * @param str
     * @return
     */
    TreeNode Deserialize(String str){
        if(str.length() == 0){
            return null;
        }

        String[] stream = str.split(",");
        return DeserializeCore(stream);
    }

    int index = -1;

    TreeNode DeserializeCore(String[] str){
        index += 1;
        TreeNode root = null;

        if(str[index].equals("#")){
           return null;
        }else {
            root = new TreeNode(Integer.valueOf(str[index]));
            root.left = DeserializeCore(str);
            root.right = DeserializeCore(str);
            return root;
        }
    }
}
