package com.java.multithreading;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class StudentThread implements Runnable {

	private String studentName;
	private CyclicBarrier cyclicBarrier;

	public StudentThread(String studentName, CyclicBarrier cyclicBarrier) {
		this.studentName = studentName;
		this.cyclicBarrier = cyclicBarrier;
	}

	@Override
	public void run() {
		System.out.println(studentName + " : has joined the session");
		try {
			if (this.cyclicBarrier.await() == 0) {
				System.out.println("All students have joined, Lets start the Java Tutorial Session!");
			}
		} catch (InterruptedException e) {
			System.err.println(e.toString());
		} catch (BrokenBarrierException e) {
			System.err.println(e.toString());
		}

	}
}
