package easy;

public class MergeSortedLists21 {
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null)
            return null;
        else if(l1 == null)
            return l2;
        else if(l2 == null)
            return l1;
        else {
            ListNode head = null;
            ListNode a = null;
            ListNode b = null;
            ListNode temp = null;
        
            if(l1.val <= l2.val) {
                head = l1;
                a = l1.next;
                b = l2;
            }
            else {
                head = l2;
                a = l1;
                b = l2.next;
            }
            temp = head;
        
            while((a != null) && (b != null)) {
                if(a.val <= b.val) {
                    temp.next = a;
                    temp = temp.next;
                    a = a.next;
                }
                else {
                    temp.next = b;
                    temp = temp.next;
                    b = b.next;
                }
            }
            if(a != null) {
                temp.next = a;
            }
            if(b != null) {
                temp.next = b;
            }
            return head;
        }
    }
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(3);
		ListNode l3 = new ListNode(7);
		ListNode l4 = new ListNode(10);
        l1.next = l2;l2.next=l3;l3.next=l4;
		
		
		ListNode l11 = new ListNode(2);
		ListNode l12 = new ListNode(4);
		ListNode l13 = new ListNode(6);
		ListNode l14 = new ListNode(7);
		ListNode l15 = new ListNode(9);
		ListNode l16 = new ListNode(12);
		ListNode l17 = new ListNode(16);
		l11.next=l12;l12.next=l13;l13.next=l14;l14.next=l15;l15.next=l16;l16.next=l17;
		
		ListNode head = mergeTwoLists(l1,l11);
		while(head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
	
}
