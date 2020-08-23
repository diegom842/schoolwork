package APT4;

public class DoubleList {
    public ListNode bigify(ListNode list) {

        ListNode first = list; //reference to first node in list

        while(list != null)
        {
            ListNode temp = new ListNode(list.info, list.next);
            temp.next = list.next;
            list.next = temp;
            list = temp.next;
        }

        return first;
    }
}
