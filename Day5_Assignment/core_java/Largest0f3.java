package day_5;

import java.util.Scanner;

public class Largest0f3 {

	public static void main(String[] args) {
		
		int num1, num2, num3, temp, max;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the 1st number");
		num1 = sc.nextInt();
		
		System.out.println("Please Enter the 2nd number");
		num2 = sc.nextInt();
		
		System.out.println("Please Enter the 3rd number");
		num3 = sc.nextInt();
		sc.close();
		
		temp = (num1 > num2) ? num1 : num2;
		max = (temp > num3) ? temp : num3;
		
		System.out.println(max + " is the Maximum number");
		
	}

}
