package com.ExceptionHandling.practise;

public class NumberFormat {
	public static void main(String[] args) {
        String input = "abc123"; // Invalid number format

        try {
            int number = Integer.parseInt(input); 
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        } finally {
            System.out.println("Conversion attempt finished.");
        }
    }

}
