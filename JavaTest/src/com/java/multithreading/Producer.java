package com.java.multithreading;

public class Producer implements Runnable{

	@Override
	public void run() {
		
		synchronized (ProConExample.dataList) {
			while(ProConExample.dataList.isEmpty()) {
				ProConExample.dataList.add(1);
				System.out.println("Data Inserted :"+1);
				try {
					ProConExample.dataList.notify();
					ProConExample.dataList.wait();
				}catch (InterruptedException e) {
					System.out.println(e.toString());
				}
				
				
			}
		}
		}
	}


