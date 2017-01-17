package easy;

class ListNode {
    int val;
    ListNode next;
	ListNode(int x) { 
		val = x; 
	}
}

public class ReverseLinkedListII92 {
	public static ListNode reverseBetween(ListNode head, int m, int n) {
		if(head == null)
            return null;
		
		ListNode newHead = new ListNode(0);
		newHead.next = head;
		
		ListNode front0 = null;
        ListNode front1 = null;
        
        ListNode pre = newHead;
        ListNode p = null;
        ListNode behind = null;
		
        for(int i = 0; i < (m - 1); i++) {
        	pre = pre.next;
        }
        front0 = pre;
        pre = pre.next;
        front1 = pre;
        p = pre.next;
        
        for(int j = 0; j < (n-m); j++) {
            behind = p.next;
            p.next = pre;
            pre = p;
            p = behind;
        }
        
        front1.next = p;
        front0.next = pre;
        
		return newHead.next;
	}
	
	public static void main(String[] args) {
		
	}
}
