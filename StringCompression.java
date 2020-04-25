package com.cci.chapter1;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {	
	
	public static void main(String[] args) {
		String input="aabbccacdd";
		System.out.println("Compressed str :"+compress(input));
	}
	
	public static String compress(String inputStr) {
		Map<String, Integer> map=new HashMap<String,Integer>();
		int count=0;
		for (int i = 0; i < inputStr.length(); i++) {
			for (int j = 1; j <inputStr.length(); j++) {
				if(inputStr.charAt(i)==inputStr.charAt(j)) {
					count++;
				}
			}
			map.put(""+inputStr.charAt(i), count);
			count=0;
		}
		System.out.println("final map"+map);
		return "";
	}
	
}
