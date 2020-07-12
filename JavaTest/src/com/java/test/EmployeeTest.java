package com.java.test;

import java.util.HashMap;
import java.util.Map;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Employee, Integer> hm= new HashMap();
		
		Employee e1= new Employee(1);
		Employee e2= new Employee(2);
		hm.put(e1, 1);
		hm.put(e2, 2);
		hm.put(e1, 3);
		
		if(e1==e2) {
			
			System.out.println("Same");
		}
		
		System.out.println("Size "+hm.size());
		System.out.println("E1 Val "+hm.get(e1));
		System.out.println("E2 Val "+hm.get(e2));
		System.out.println("E1 Hash "+e1.hashCode());
		System.out.println("E2 Hash "+e2.hashCode());
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(hm);
		
		

	}

}
