package com.java.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class printtemp
{
	public static void print(int num) {
		System.out.println(num);
	}
}


public class StreamExample {

	public static void main(String[] args) {
		
		List<Integer> numberList = new ArrayList<>();
		for(int i : Arrays.asList(10,5,20,14,15,30)) {
			numberList.add(i);
		}
		System.out.println(numberList);
		
		// Num less than 10 // Predicate Example
		List<Integer> filterList= numberList.stream().filter(num->(num<10)).collect(Collectors.toList());
		System.out.println(filterList);
		List<Integer> evenList= numberList.stream().filter(num->(num%2==0)).collect(Collectors.toList());
		System.out.println(evenList);
		//Funtiona Example
		List<Integer> addList = numberList.stream().map(num->num+10).collect(Collectors.toList());
		System.out.println(addList);
		System.out.println("Print with System");
		numberList.stream().forEach(System.out::println);
		System.out.println("Print with Custom");
		numberList.stream().forEach(printtemp::print);
		//Block example
		System.out.println("Block Example");
		numberList.forEach(num->{
			num++;
			System.out.println(num);
		});
		
		List<Integer> sortList= numberList.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted with Natural Sorting Order");
		System.out.println(sortList);
		
		List<Integer> customSortList= numberList.stream().sorted((num1,num2)->num1>num2?-1:num1<num2?1:0).collect(Collectors.toList());
		System.out.println("Custom Sorted with Natural Sorting Order(Desending)");
		System.out.println(customSortList);
		
		
		

	}

}
