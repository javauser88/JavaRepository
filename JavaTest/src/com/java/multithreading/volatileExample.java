package com.java.multithreading;

import java.util.Arrays;

public class volatileExample {
	private volatile int count = 0;

	public static void main(String[] args) {
		volatileExample volatileExample = new volatileExample();
		for (int i : Arrays.asList(1, 2, 3, 4, 5, 6, 7)) {
			Runnable incrementThread = () -> volatileExample.incrementCount();
			new Thread(incrementThread).start();
		}
		System.out.println(volatileExample.count);

	}

	public void incrementCount() {
		count++;
	}

}
