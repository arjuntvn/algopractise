package com.cci.chapter1;

public class OneAway {
	public static void main(String[] args) {
		//one char added case
		String e1="pale";
		String e2="pales";
		isOneoff(e1,e2);
		// one char less case
		String e3="pale";
		String e4="ple";
		isOneoff(e3,e4);
		//More than two edit case
		String e5="pale";
		String e6="bake";
		isOneoff(e5, e6);
	}
	
	public static void isOneoff(String e1,String e2) {
		int count=0;
		for (int i = 0; i < e2.length(); i++) {
			if(e1.contains(e2.charAt(i)+"")) {
				continue;
			}else {
				count++;
			}
		}
		if(count>1) {
			System.out.println("More than 1 edits are done to string");
		}else {
			System.out.println("String has one char away");
		}
	}
}
