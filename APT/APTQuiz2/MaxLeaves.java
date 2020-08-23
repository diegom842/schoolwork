package APTQuiz2;

import APT5.TreeNode;
import java.util.ArrayList;

public class MaxLeaves {
    int height;

    ArrayList<Integer> trees = new ArrayList<>();

    public int[] gather(TreeNode tree) {
        height = height(tree);

        getMaxLeaves(1, tree);

        int[] ret = new int[trees.size()];
        for(int i = 0; i < ret.length; i ++)
        {
            ret[i] = trees.get(i);
        }

        return ret;
    }

    public void getMaxLeaves(int level, TreeNode tree)
    {
        if(tree == null)
            return;

        if(level == height)
            trees.add(tree.info);

        getMaxLeaves(level + 1, tree.left);
        getMaxLeaves(level + 1, tree.right);
    }

    public int height(TreeNode tree) {
        if (tree == null) return 0;
        return 1 + Math.max(height(tree.left), height(tree.right));
    }
}
