//Insert data at first --> Time Complexity O(1)
//Insert data at end --> Time Complexity O(N)
package com.linkedlist;

public class Node<T> {
	
	  T data;
	  Node next;
	 public Node (T data2){
		 this.data = data2;
		 next = null;
	 }
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	 
	 
}
