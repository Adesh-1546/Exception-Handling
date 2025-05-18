package com.ExceptionHandling;
/*
 * Exception Handling in Java is a powerful mechanism that handles runtime errors to maintain the normal flow of the application.
 * It helps prevent the program from crashing when an unexpected situation occurs.
 * to handle the Exception in java by using try , catch , finally block and throws & throw keywords.
 */

public class ExceptionSyntax {
	
	public static void main(String[] args) {
		
		//divide by Zero exception
		
		try {
			System.out.println(2/0);
		} catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("This line has a Exception : "+e.getMessage());
		}finally {
			System.out.println("this is finally block");
		}
	}
	
	

}
