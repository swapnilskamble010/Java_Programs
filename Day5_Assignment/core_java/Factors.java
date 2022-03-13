package day_5;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number to find out the prime factors");
		num = sc.nextInt();
		sc.close();
		
		for (int i = 2; i <= num; i++) {
			while (num % i == 0) {
				System.out.println(i);
				num = num/i;	
			}
		}
	}

}
