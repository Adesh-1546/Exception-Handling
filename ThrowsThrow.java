package com.ExceptionHandling;



public class ThrowsThrow {
	public static void main(String[] args) throws ClassNotFoundException{
		Home h = new Home();
		try {
			h.m1();
		}catch(ClassNotFoundException e ){
			System.out.println("This is not Found");
			e.printStackTrace();
			
		}
	}

}
