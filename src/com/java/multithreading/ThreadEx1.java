package com.java.multithreading;


public class ThreadEx1{
	
	static Thread mainThread = Thread.currentThread();
	public static void main(String[] args) throws InterruptedException {
		ThreadClass t1 = new ThreadClass();
		//ThreadClass t2 = new ThreadClass();
		t1.setName("Thread One");
		//t2.setName("Thread Two");
		t1.start();
		
		System.out.println(Thread.currentThread().getName());
		//t1.join();
		//Thread.currentThread().yield();
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread is running");
		}

		
		
//		System.out.println(t1.getName());
//		System.out.println(t1.isAlive());
//		t2.run();
//		System.out.println(t2.isAlive());
//		System.out.println(t2.getName());
	}
	
}

class ThreadClass extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				ThreadEx1.mainThread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Child thread is running...");
			//Thread.yield();
		}
		
	}
	
	

}
