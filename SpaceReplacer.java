package com.cci.chapter1;

public class SpaceReplacer {
	public static void main(String[] args) {
		
		String input="Mr John Smith    ";
		int len=13;
		String repChar="%20";
		String out=replace(input, repChar, len);
		System.out.println("Processed String is : "+out);
		
	}
	
	public static String  replace(String input,String repChar,int len) {
				String mod=input.replace(" ","x");
				String finalStr="";
				for(int i=0;i<len;i++) {
					char c=mod.charAt(i);
					//System.out.println("Char at i "+i+"is "+c);
					finalStr+=c;
				}
				finalStr=finalStr.replace("x","%20");
		return	finalStr;
	}
}
