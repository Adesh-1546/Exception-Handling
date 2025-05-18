package com.ExceptionHandling.practise;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter Number");
			int num = sc.nextInt();
			System.out.println(num);
		} catch (InputMismatchException e) {
			System.out.println("Exeption caught : "+e.getMessage());
		}finally {
			System.out.println("Enter Interger value only");
		}
		
		sc.close();
	}

}
