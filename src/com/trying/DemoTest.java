package com.trying;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.parser.Entity;

public class DemoTest {
	static int x = 10;
	int y = 15;

	public void m1() {
		x = 20;
		y = y + 15;
		System.out.println("inside m1");
		System.out.println(DemoTest.x);
	}

	public static void m2(DemoTest obj) {
		System.out.println("Inside m2");
		obj.m1();
	}

	public static void hashSet() {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(2);
		hs.add(1);
		hs.add(4);
		hs.add(3);
		hs.add(6);
		hs.add(2);
		hs.add(null);
		Iterator<Integer> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	public static void hashMap() {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(2, "Manoj");
		hm.put(1, "Kappa");
		hm.put(4, "Viky");
		hm.put(3, "Pintu");
		hm.put(6, "Milu");
		for (Entry<Integer, String> entry1 : hm.entrySet()) {
			System.out.println(
					"Key: " + entry1.getKey() + ", Value: " + entry1.getValue() + ", Class: " + entry1.getClass());

		}
		Collection<String> c = hm.values();
		Set<Integer> s = hm.keySet();
		System.out.println(c);
	}
	
	public static void arrayAsList(Integer[] arr) {
		List<Integer> lis = Arrays.asList(arr);
		System.out.println(lis);
		byte x = 2;
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoTest obj = new DemoTest();
		//obj.m1();
		//m2(obj);
		//hashMap();
		//hashSet();
		Integer arr[] = {2,3,6,7,1,9};
		arrayAsList(arr);
	}

}
