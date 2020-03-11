package com.niit.lambda;

import java.util.Arrays;
public class ExampleDemo {  

   public static void main(String[] args) {  
	String[] stringArray = { "Steve", "Rick", "Aditya", "Negan", "Lucy", "sansa", "Jon"};
	/* Method reference to an instance method of an arbitrary 
	 * object of a particular type
	 */
	Arrays.sort(stringArray, String::compareToIgnoreCase);
	for(String str: stringArray){
		System.out.println(str);
	}
   }  
}