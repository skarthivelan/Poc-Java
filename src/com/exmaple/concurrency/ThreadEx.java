package com.exmaple.concurrency;

public class ThreadEx extends Thread {
	
	@Override
	public void run() {
		System.out.println("Thread Name " + Thread.currentThread().getName());
	}
	
}