package com.trying;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainClass {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		Employee emp1 = new Employee(22, 10000, "PPBU");
		Employee emp2 = new Employee(20, 5000, "IO");
		Employee emp3 = new Employee(24, 15000, "Admin");
		Employee emp4 = new Employee(29, 22000, "CoreSync");
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		al.add(emp4);
		Collections.sort(al);
		System.out.println("Sorting in Ascending Order: " + al);
		//Using Comparator anonymous class
		Collections.sort(al, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.age > o2.age ? -1: o1.age < o2.age ? 1 : 0;
			}
		});
		System.out.println("Sorting in Descending Order: " + al);
	}

}
