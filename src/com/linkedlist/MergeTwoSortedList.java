package com.linkedlist;

public class MergeTwoSortedList {

	public static void mergeList(Node n1, Node n2) {
		Node<Integer> dummy = new Node<>(-1);
		Node head = dummy;
		while (n1 != null && n2 != null) {

			if ((int) n1.data < (int) n2.data) {
				dummy.next = n1;
				n1 = n1.next;
			} else {
				dummy.next = n2;
				n2 = n2.next;
			}
			dummy = dummy.next;
		}
		if (n1 != null) {
			dummy.next = n1;
		} else {
			dummy.next = n2;
		}
		head = head.next;
		while (head != null) {
			System.out.print(head.data + ",");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.insert(10);
		list1.insert(30);
		list1.insert(50);
		list1.insert(80);
		list1.insert(90);

		LinkedList<Integer> list2 = new LinkedList<>();
		list2.insert(20);
		list2.insert(40);
		list2.insert(60);
		mergeList(list1.head, list2.head);
		
	}

}
