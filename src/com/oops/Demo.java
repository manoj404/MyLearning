package com.oops;

public class Demo
{
	public static void main(String[] args) {
	    A a = new A();
	    a.m();
	    B b = new B();
	    b.m();
	    A a1 = new B();
	    a1.m();
	    //B b1 = new A(); we can not store parent class object to a child class reference
	    //b1.m();
	}
	
}

class A {
    int x;
    int y;
    public static void m() {
        System.out.println("Parent");
    }
}
class B extends A {
    int x;
    int y;
    public static void m() {
        System.out.println("Child");
    }
}
