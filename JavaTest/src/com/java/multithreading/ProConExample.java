package com.java.multithreading;

import java.util.ArrayList;
import java.util.List;

public class ProConExample {
	
	public static List<Integer> dataList = new ArrayList<Integer>();

	public static void main(String[] args) {
		Thread producer = new Thread(new Producer());
		Thread consumer = new Thread(new Consumer());
		producer.start();
		consumer.start();

	}

}
