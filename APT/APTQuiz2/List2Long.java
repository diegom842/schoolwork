package APTQuiz2;

import APT4.ListNode;

public class List2Long {
    public long convert(ListNode list) {

        if(list == null) return 0;

        long ret = 0;

        while(list != null)
        {
            ret = (ret*10) + list.info;
            list = list.next;
        }

        return ret;
    }
}
