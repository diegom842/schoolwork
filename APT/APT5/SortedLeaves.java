////package APT5;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class SortedLeaves {
//
//    private ArrayList<Character> charList;
//
//    public String[] values(TreeNode tree) {
//        charList = new ArrayList<>();
//
//        sort(tree);
//
//        String[] ret = new String[charList.size()];
//        for(int k=0; k < ret.length; k++) {
//            ret[k] = ""+ charList.get(k);
//        }
//
//        Arrays.sort(ret);
//        return ret;
//    }
//
//    private void sort(TreeNode t) {
//        if (t == null)
//            return;
//
//        //if it is a leaf
//        if (t.left == null && t.right == null)
//        {
//            charList.add((char) (t.info));
//            return;
//        }
//
//        sort(t.left);
//        sort(t.right);
//    }
//
//}
