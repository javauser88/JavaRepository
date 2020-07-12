package com.java.multithreading;

import java.util.Arrays;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarierExample {
	
	public static void main(String[] args) {
		CyclicBarrier cyclicBarrier = new CyclicBarrier(5);
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for(int count : Arrays.asList(1,2,3,4,5)) {
			executorService.execute(new StudentThread("Student_"+count, cyclicBarrier));
			}
		executorService.shutdown();
	}

}
