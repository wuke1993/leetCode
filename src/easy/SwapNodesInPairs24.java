package easy;

// 2016.04.22

public class SwapNodesInPairs24 {
	public static ListNode swapPairs(ListNode head) {
        if(head == null)
            return null;
        else if(head.next == null)
            return head;
        else {
            ListNode newHead = new ListNode(0); // 凡是头节点会改变的，尽量自己新创建一个头节点！
            newHead.next = head;
            
            ListNode t = newHead; // 三个临时节点
            ListNode f = head;
            ListNode b = head.next;
            
            while(f != null && b != null) {
                f.next = b.next;
                t.next = b;
                b.next = f;
                
                t = f;
                f = f.next;
                if(f != null)
                    b = f.next;
                else
                    break;
            }
            
            return newHead.next;
        }
    }
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(3);
        l1.next = l2;
		
        ListNode l111 = new ListNode(1);
		ListNode l112 = new ListNode(3);
		ListNode l113 = new ListNode(4);
        l111.next = l112;l112.next=l113;
        
		ListNode l11 = new ListNode(2);
		ListNode l12 = new ListNode(4);
		ListNode l13 = new ListNode(6);
		ListNode l14 = new ListNode(7);
		l11.next=l12;l12.next=l13;l13.next=l14;
		
		ListNode head = swapPairs(l111);
		while(head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}
