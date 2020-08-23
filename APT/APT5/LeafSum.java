package APT5;

public class LeafSum {
    public int sum(TreeNode t)
    {
        if(t == null)
        {
            return 0;
        }

        if(t.right == null && t.left == null)
        {
            return t.info;
        }

        return sum(t.left) + sum(t.right);
    }

}
