package day_5;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a four digit Year to check whether it is a Leap Year or Not");
		int year = sc.nextInt();
		sc.close();
		
		if (year >= 1000) {
			
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.println("Year " + year + " is a Leap Year");
			}
			else {
				System.out.println("Year " + year + " is not a Leap Year");
			}
				
		}
		else
			System.out.println("Invalid Input..!\nPlease Enter Four Digit Year");
		
	}

}
