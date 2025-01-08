package JavaCoreProblems;

import java.util.ArrayList;


public class jan8_1 {

	//Write a Java Program to reverse each individual word of a given String
	

	
	public static void reverse() {
		String input = "mathu mathi";
		
	String[] words = input.split(" ");
	
	StringBuilder result = new StringBuilder();
	
	for(String word: words) {
		result.append(new StringBuilder(word).reverse().toString()).append(" ");
		
	}
	System.out.println(result.toString().trim());
	
	}
	
	
	public static void main(String[] args) {
		reverse();
	}
	
	
	
}
