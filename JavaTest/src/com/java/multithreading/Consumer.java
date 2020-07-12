package com.java.multithreading;

public class Consumer implements Runnable {

	@Override
	public void run() {
		
		synchronized (ProConExample.dataList) {
			while(!ProConExample.dataList.isEmpty()) {
				System.out.println("Data Retrived :"+ProConExample.dataList.get(0));
				ProConExample.dataList.clear();
				try {
					ProConExample.dataList.notify();
					ProConExample.dataList.wait();
				}catch (InterruptedException e) {
					System.out.println(e.toString());
				}
				
			}
			
		}
		
	}}


