package day_5;

import java.util.Scanner;

public class Power0f2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number to print power of 2");
		int num = sc.nextInt();
		sc.close();
		
		if (num >= 0 && num < 31 ) {
			
			for (int i = 0; i <= num; i++) {
				System.out.println("2 ^ " + i + " = " + Math.pow(2, i));
			}
			
		}
		else {
			System.out.println("Overflow..! \tInvalid Input \n\tPlease Enter number in between 0 & 31");
		}
			
		

	}

}
