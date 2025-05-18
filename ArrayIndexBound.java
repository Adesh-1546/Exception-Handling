package com.ExceptionHandling.practise;

public class ArrayIndexBound {
	public static void main(String[] args) {
		
		int []arr = {10,20,30,40,50};
		
		try {
			System.out.println("Accessing 10th element : "+arr[9]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception caught: " + e);
			System.out.println("Exception caught : "+e.getMessage());
		}finally {
			System.out.println("Check length");
		}
	}

}
