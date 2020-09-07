package com.linkedlist;

import java.util.HashSet;

public class DetectLoop {
	
	public static boolean detectLoop(Node n) {
		
		HashSet<Node> hs = new HashSet<>();
		while(n != null) {
			if(hs.contains(n))
				return true;
			hs.add(n);
			n = n.getNext();
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		//ll.head.getNext().getNext().getNext().setNext(ll.head);
		if(detectLoop(ll.head))
			System.out.println("loop found");
		else	
		System.out.println("loop not found");
	}

}
