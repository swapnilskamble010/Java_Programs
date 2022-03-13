//Euclidean distance from the point (x, y) to the origin (0, 0)

package day_5;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		
		double dist;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a value of x : ");
		float x = sc.nextFloat();
		System.out.println("Please enter a value of y : ");
		float y = sc.nextFloat();
		sc.close();
		
		dist = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		System.out.println("Euclidean distance from (x,y) to the Origin (0,0) is: " + Math.round(dist * 100.0)/100.0);

	}

}
