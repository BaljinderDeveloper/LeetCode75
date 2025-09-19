package BinaryTree_DFS.Easy;

import java.util.Collections;

public class Prog1_104_MaximumDepthOfBinaryTree {
    int depth = 0;
    public static void main(String[] args) {

    }
    public int maxDepth(TreeNode root) {
        int max = 0;
        if(root == null){
            return 0;
        } else if (root != null) {
            max = Math.max(maxDepth(root.left), maxDepth(root.right));
        }
        return 1 + max;
    }
}
