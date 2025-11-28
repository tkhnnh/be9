package be9;

public class Main {
	public static void  main(String[] args) {
		B9LinkdedList ll = new B9LinkdedList();
		
		
		LLNode node1 = new LLNode();
		LLNode node2 = new LLNode();
		LLNode node3 = new LLNode();
		LLNode node4 = new LLNode();
		LLNode node5 = new LLNode();
		node1.value = 5;
		node2.value = 8;
		node3.value = 7;
		node4.value = 5;
		ll.head = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = null;
		
		
		
		node4.next = node2.next;
		node2.next = node4;
		
		LLNode curr = ll.head;
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
		
	}
	
	
}
