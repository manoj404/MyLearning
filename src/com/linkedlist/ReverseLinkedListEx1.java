package com.linkedlist;

public class ReverseLinkedListEx1 {
	
	
	public void reverseLinkedList(LinkedList<Integer> list){
		
		Node prev = null;
		//Node temp = list.head;
		Node next = null;
		Node currNode = list.head;
		while(currNode != null){
			next = currNode.getNext();
			currNode.setNext(prev);
			prev = currNode;
			currNode = next;
		}
		list.head = prev;
		
		list.displayList();
		
	}

	public static final void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLinkedListEx1 rls = new ReverseLinkedListEx1();
		LinkedList<Integer> ls = new LinkedList<Integer>();
		ls.insert(1);
		ls.insert(2);
		ls.insert(3);
		ls.insert(4);
		ls.insert(5);
		System.out.println("Original List:");
		ls.displayList();
		rls.reverseLinkedList(ls);
		
	}
	

}
