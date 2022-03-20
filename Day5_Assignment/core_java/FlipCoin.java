//Flip Coin and print percentage of Heads and Tails

package helloworld;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		
		int head = 0;
		int tail = 0;
		double headPercent;
		double tailPercent;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number for how many times to flip a coin");
		int count = sc.nextInt();
		sc.close();
		
		for (int i = 1; i <= count; i++) {
			
			double result = Math.random()%2;
			System.out.println(Math.round(result*10.0)/10.0);
			if (result < 0.5) {
				tail++;
				
			}
			else {
				head++;
				
			}
			
		}
			
		tailPercent = ((double)tail/count)*100;
		headPercent = ((double)head/count)*100;
		
		System.out.println("Percentage of Tail: " + tailPercent);
		System.out.println("Percentage of Head: " + headPercent);
		//System.out.println(tail);
		//System.out.println(head);
		
	}

}
