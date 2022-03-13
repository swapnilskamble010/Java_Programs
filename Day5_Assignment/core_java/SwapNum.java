package day_5;

import java.util.Scanner;

public class SwapNum {

	public static void main(String[] args) {
		
		int a, b, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a 1st number");
		a = sc.nextInt();
		
		System.out.println("Please enter a 2nd number");
		b = sc.nextInt();
		sc.close();
		
		System.out.println("Numbers before swapping are: " + a + " " + b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("Numbers after swapping: "+ a + " " + b);
	}

}
