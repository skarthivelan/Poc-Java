package com.exmaple.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcutorEx {

	public static void main(String[] args) {
		ExecutorService ex = Executors.newFixedThreadPool(3);
		
		Runnable tasks = () -> {
			System.out.println("Tasks - " + Thread.currentThread().getName());
		};
		
		ex.execute(() -> System.out.println("33"));
		
		for(int i =1; i<5; i++) {
			ex.submit(tasks);
		}
		
		ex.submit(tasks);

	}

}
