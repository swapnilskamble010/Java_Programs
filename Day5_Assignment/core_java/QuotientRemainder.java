package day_5;

import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		
		float a, b, quotient, remainder;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number(Dividend): ");
		a = sc.nextFloat();
		System.out.println("Please enter a number(Divisor): ");
		b = sc.nextFloat();
		sc.close();
		
		quotient = a / b ;
		remainder = a % b;
		
		System.out.println("Quotient is : " + quotient);
		System.out.println("Remainder is : " + remainder);
		
	}

}
