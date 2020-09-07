package com.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentModificationException {

	public static void removeMarks(List<Integer> marks) {
		for (Integer i : marks) {
			if (i < 40) {
				marks.remove(i);
				System.out.println(marks);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(10);
		marks.add(20);
		marks.add(30);
		marks.add(40);
		ConcurrentModificationException.removeMarks(marks);
	}

}
