package com.java.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumPair {

	public static void main(String[] args) {
		int k = 100;
		StringBuffer pair = new StringBuffer();
		List<Integer> numList = new ArrayList<>(Arrays.asList(2,50,60,40,95,5,98));
		numList.stream().forEach(num -> {
			int n = k - num;
			if (n > 0 && numList.indexOf(n) != -1) {
				if(pair.indexOf(n + ":" + num)==-1)
				pair.append(num + ":" + n).append("|");
			}
		});
		System.out.println(pair);
	}
}
