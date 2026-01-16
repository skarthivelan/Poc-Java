package com.exmaple.concurrency;

public class ThreadRunnableEx implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Runnable - "+ Thread.currentThread().getName());
	}

}
