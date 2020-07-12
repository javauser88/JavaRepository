package com.java.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample {

	public static void main(String[] args) {
		
		CountDownLatch countDownLatch = new CountDownLatch(2);
		DataBaseTestTask dataBaseTestTask = new DataBaseTestTask(countDownLatch);
		JMSServicetest jmsServicetest = new JMSServicetest(countDownLatch);
		
		List<Runnable> taskList = new ArrayList<Runnable>();
		taskList.add(dataBaseTestTask);
		taskList.add(jmsServicetest);		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		System.out.println("Test server connection :");
		taskList.forEach(task -> {executorService.execute(task);});
		try {
			countDownLatch.await();
		}catch (InterruptedException e) {
			System.err.println(e.toString());
		}
		
		//Start Application
		executorService.execute(new StartApplication());
		
		executorService.shutdown();
		

	}
	}
