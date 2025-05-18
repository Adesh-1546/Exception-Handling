package com.ExceptionHandling.practise;

public class NullPointer {
	private static String str;

	public static void main(String[] args) {
		
		str = null;
		
		try {
			System.out.println("Length of String : "+str.length());
		} catch (NullPointerException e) {
			System.out.println("Exception caught : "+e.getMessage());
		}
	}

}
