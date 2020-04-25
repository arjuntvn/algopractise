package com.cci.chapter1;

import java.util.ArrayList;
import java.util.List;

public class IsPermutation {

	public static void main(String[] args) {
		String one="abc";
		String two="bca";
		boolean areUnique=checkUniqueness(one,two);
		System.out.println("Are string unique :"+areUnique);
	}
	
	public static boolean checkUniqueness(String one,String two) {
		List<Character> list=new ArrayList<Character>();
		for (int i = 0; i < one.length();i++) {
			list.add(one.charAt(i));
		}
		for (int i = 0; i < two.length(); i++) {
			
			if(list.contains(two.charAt(i))) {
				continue;
			}else {
				return false;
			}
		}
		return true;
	}
}
