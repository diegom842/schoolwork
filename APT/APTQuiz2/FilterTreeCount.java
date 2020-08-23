package APTQuiz2;

import APT5.TreeNode;

public class FilterTreeCount {
    public int count(TreeNode tree, int low, int high) {
        if(tree == null) return 0;

        if(tree.info <= high && tree.info >= low)
            return 1 + count(tree.left, low, high) + count(tree.right, low, high);

        return count(tree.left, low, high) + count(tree.right, low, high);
    }
}
