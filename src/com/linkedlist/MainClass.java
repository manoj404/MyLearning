package com.linkedlist;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Long> list = new LinkedList<Long>();
		Scanner sc = new Scanner(System.in);
		list.insert(1l);
		list.insert(127l);
		list.insert(5l);
		list.insert(4l);
		list.insert(7l);
		list.insert(9l);
		list.insert(5l);
		list.insert(11l);
		list.insert(21l);
		list.insert(142l);
		list.displayList();
		System.out.println("List size = " + list.size);
		for(int i=0; i <= list.size; i++){
			System.out.println("Enter an element to delete: ");
			long item1 = sc.nextLong();
			list.delete(item1);
			list.displayList();
			System.out.println("List size = " + list.size);
		}
//		System.out.println("Enter an element to insert: ");
//		Scanner sc = new Scanner(System.in);
//		int item = sc.nextInt();
//		list.insert(item);
		sc.close();
		//list.displayList();
		
	}

}
