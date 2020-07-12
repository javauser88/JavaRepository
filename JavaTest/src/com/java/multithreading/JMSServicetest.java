package com.java.multithreading;

import java.util.concurrent.CountDownLatch;

public class JMSServicetest implements Runnable {
	
	private CountDownLatch countDownLatch;
	public JMSServicetest(CountDownLatch countDownLatch) {
		this.countDownLatch = countDownLatch;
	}
	@Override
	public void run() {
		try {
			if(isJMSServiceConnected()) {
				System.out.println("JMS Server connected successfully :");
				this.countDownLatch.countDown();
			}else {
				throw new Exception("Failed to connect JMS Server");
			}
		}catch (Exception e) {
			System.err.println(e.toString());
		}
		
	}
	
	private boolean isJMSServiceConnected() {
		return true;
	}
}
