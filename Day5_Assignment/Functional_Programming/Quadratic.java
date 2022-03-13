//Roots of Quadratic equation

package day_5;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		
		float delta, root1, root2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a value of a : ");
		float a = sc.nextFloat();
		System.out.println("Please enter a value of b : ");
		float b = sc.nextFloat();
		System.out.println("Please enter a value of c : ");
		float c = sc.nextFloat();
		sc.close();
		
		delta = (b * b) - (4 * a * c);
		root1 = (float)(- b + Math.sqrt(delta))/(2*a);
		root2 = (float)(- b - Math.sqrt(delta))/(2*a);
		
		if ( delta > 0) {
			System.out.println("First Root of x :  " + root1);
			System.out.println("Second Root of x :  " + root2);
		}
		else {
			System.out.println("Roots are not real..\nTry for another values of a, b, c");
		}
	}

}
