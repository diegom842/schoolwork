package APT4;

public class ListStretch {
    public ListNode stretch (ListNode list, int amount){
        ListNode first = list;

        while(list != null)
        {
            ListNode tempPtr = list.next;

            for(int i = 0; i < amount - 1; i++)
            {
                list.next = new ListNode(list.info);
                list = list.next;
            }

            list.next = tempPtr;
            list = list.next;
        }

        return first;
    }
}