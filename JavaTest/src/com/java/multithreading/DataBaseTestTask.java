package com.java.multithreading;

import java.util.concurrent.CountDownLatch;

public class DataBaseTestTask implements Runnable {
	
	private CountDownLatch countDownLatch;
	public DataBaseTestTask(CountDownLatch countDownLatch) {
		this.countDownLatch = countDownLatch;
	}
	@Override
	public void run() {
		try {
			if(isdataBaseConnected()) {
				System.out.println("Database connected successfully:");
				this.countDownLatch.countDown();
			}else {
				throw new Exception("Failed to connect database");
			}
		}catch (Exception e) {
			System.err.println(e.toString());
		}
		
	}
	
	private boolean isdataBaseConnected() {
		return true;
	}
}
