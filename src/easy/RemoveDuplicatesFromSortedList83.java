package easy;

// ɾ��һ�����ź����˳����е��ظ�Ԫ�أ�ֻ����һ��

public class RemoveDuplicatesFromSortedList83 {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        if(temp == null)
        	return head;
        while(temp.next != null) {
            if(temp.val == temp.next.val)
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }
        return head;
    }
    
    public static void main(String[] args) {
    	ListNode head = null;
    	System.out.println(deleteDuplicates(head));
    }
}
