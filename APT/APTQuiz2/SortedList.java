package APTQuiz2;

import APT4.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortedList {
    public ListNode create(String[] words) {
        if(words == null) return null;

        ArrayList<String> str = new ArrayList<>(Arrays.asList(words));
        Collections.sort(str);

        ListNode list = new ListNode(Arrays.asList(words).indexOf(str.get(0)));
        ListNode ret = list;

        for(int i = 1; i < words.length; i++)
        {
            ret.next = new ListNode(Arrays.asList(words).indexOf(str.get(i)));
            ret = ret.next;
        }

        return list;
    }
}
