//Java Program to Check Whether a Number is Even or Odd

package day_5;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		System.out.println("Please Enter a number to check whether it is Even or Odd");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num%2 == 0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is Odd");
		}
		
		sc.close();

	}

}
