package com.ExceptionHandling.practise;
/*
 * Write a Java program that takes two numbers from the user and divides them. Handle the exception
 *  if the second number is zero using try-catch-finally.
    Expected: Catch ArithmeticException, and print a message like “Cannot divide by zero”.

 */
import java.util.Scanner;

public class DivideByZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num2 == 0 ) {
			try {
				System.out.println(num1/num2);
			}catch (ArithmeticException e) {
				System.out.println("Exception : "+e.getMessage());
			}finally {
				System.out.println("Cannot divide by zero");
			}
			
		} else {
			System.out.println(num1/num2);
		}
		sc.close();

    }
}
