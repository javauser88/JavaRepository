package com.java.test;

public class ReverseString {

	public static void main(String[] args) {
		String str= "Text";
		StringBuilder builder = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			builder.append(str.charAt(i));
		}
		System.out.println(builder);
	}

}
