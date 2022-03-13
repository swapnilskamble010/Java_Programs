package day_6;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		
		int n1 = 0, n2 = 1, n3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number to find out the Fibonacci Series");
		int count = sc.nextInt();
		sc.close();
		 
		System.out.print(n1+" "+n2);   
		    
		for(int i = 2; i < count; i++){
			 
		  n3 = n1 + n2;    
		  System.out.print(" "+n3);    
		  n1 = n2;    
		  n2 = n3;
		  
		 }    
		  
	}

}
