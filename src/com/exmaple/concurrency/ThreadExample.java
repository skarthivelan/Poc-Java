package com.exmaple.concurrency;

public class ThreadExample {

	public static void main(String[] args) {
		ThreadEx tx = new ThreadEx();
		ThreadEx tx1 = new ThreadEx();
		
		tx.start();
		tx1.start();
		
		Thread t1 = new Thread(new ThreadRunnableEx());
		Thread t2 = new Thread(new ThreadRunnableEx());
		
		t1.start();
		t2.start();

	}

}


