package APT4;


public class RemoveLast {
    public ListNode remove(ListNode list) {
        ListNode first = list;

        while(list != null)
        {
            if(list.next.next == null)
            {
                list.next = null;
            }
            list = list.next;
        }



        return first;
    }
}