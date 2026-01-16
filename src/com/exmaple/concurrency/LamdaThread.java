package com.exmaple.concurrency;

public class LamdaThread {

	
	public static void main(String[] args) {
		
		new Thread(() -> {
			System.out.println("Lambda Thread" + Thread.currentThread().getName());
		}).start();
	}
	
}
