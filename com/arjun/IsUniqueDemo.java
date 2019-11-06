package arjun;

import java.util.HashMap;
import java.util.Scanner;

public class IsUniqueDemo {
	public static void main(String[] args) {
		System.out.println("Enter your input ");
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		boolean isUnique = evaluate(input);
		System.out.println("Is unqiue ?"+isUnique);
	}

	public static boolean evaluate(String input) {
		int charCount=0;
		boolean unique=true;
		HashMap<Character,Integer> charVsCount=new HashMap();
		for(int i=0;i<input.length();i++) {
			
			char current=input.charAt(i);
			if(charVsCount.get(current)!=null) {
				if(charCount>1) {
					unique=false;
					return unique;
				}
			}
			charVsCount.put(current,charCount);	
			charCount++;
		}
		return unique;
		
	}
}
