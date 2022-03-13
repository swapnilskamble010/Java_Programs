package day_5;

import java.util.Scanner;

public class Harmonic {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number to find out the N-th Harmonic");
		int N = sc.nextInt();
		sc.close();
		
		System.out.println(harmonic(N));

	}
	
	public static double harmonic(int N) {
		
		float harmonic = 1;
		for (int i = 2; i <= N; i++) {
			harmonic += (float)1/i;
		}
		
		return harmonic;
	}
	
}

