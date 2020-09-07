package com.linkedlist;

public class LinkedList<T> {

	int size = 0;
	Node node;
	Node head;

	public boolean insert(T data) {
		node = new Node<T>(data);
		if (head == null) {
			head = node;
		} else {
			Node curr_Node = head;
			while (curr_Node.getNext() != null) {
				curr_Node = curr_Node.getNext();
			}
			curr_Node.setNext(node);
		}
		size = size + 1;
		return true;
	}

	public void displayList() {
		int i = 0;
		if (head == null) {
			System.out.println("List is empty");
		} else {
			Node currrNode = head;
			System.out.print("[");
			while (i < size) {
				System.out.print(currrNode.getData() + " ");
				currrNode = currrNode.getNext();
				i++;
			}
			System.out.print("]");
		}
	}

	public boolean insertAtBegining(T data) {
		node = new Node<T>(data);
		if (head == null) {
			head = node;
		} else {
			node.setNext(head);
			head = node;
		}
		size = size + 1;
		return true;
	}

	public boolean delete(T data) {
		boolean flag = false;
		if (head == null) {
			System.out.println("List is empty");
			flag = false;
		} else if (head.getData() == data) {
			Node temp = head;
			head = head.getNext();
			temp = null;
			size = size - 1;
			flag = true;
		} else {
			Node currNode = head;
			Node prevNode = new Node<T>(data);
			int i = 0;
			while (i < size) {
				if (!(currNode.getData() == data)) {
					prevNode = currNode;
					currNode = currNode.getNext();
					i++;
				} else {
					Node temp = currNode;
					prevNode.setNext(temp.getNext());
					temp = null;
					currNode = currNode.getNext();
					size = size - 1;
					flag = true;
					break;
				}
			}
		}
		return flag;
	}
}
