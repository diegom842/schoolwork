package APT4;

public class RemoveMin {
    public ListNode remove (ListNode list) {
        ListNode temp = list;
        ListNode first = list;

        if(first == null)
            return null;


        int min = Integer.MAX_VALUE;
        //passes through the list once, looking for the min value
        while(temp != null)
        {
            if(temp.info < min)
            {
                min = temp.info;
            }

            temp = temp.next;
        }

        if(first.info == min)
            return first.next;

        while(list.next.info != min)
        {
            list = list.next;
        }

        list.next = list.next.next;

        return first;
    }
}