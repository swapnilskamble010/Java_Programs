package day_5;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		
		double w;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the temperature in Fahrenheit, t = ");
		double t = sc.nextDouble();
		System.out.println("Please enter the speed of wind in miles/hour, v = ");
		double v = sc.nextDouble();
		sc.close();
		
		if (t < 50) {
			
			if (v < 120 && v > 3) {
				
				w = 35.74 + (0.6215 * t) + ((0.4275 * t - 35.75) * Math.pow(v, 0.16));
				System.out.println("Wind Chill is = " + w);
				
			}
			else {
				
				System.out.println("Invalid input..!, value of v should be in between 3 and 120");
			}
		
		}
		else {
			
			System.out.println("Invalid input..!, value of t should be less than 50");
		}
	}
		
}
