package day_6;

import java.util.Scanner;

public class PerfectNumber {
		
		public static boolean isPerfect(int n){
	        
	        if (n == 1) {
	        	return false;
	        }
	     
	        int sum = 1;
	  
	        for (int i = 2; i < n; i++) {
	            
	            if (n % i == 0) {
	                sum += i;
	            }
	            
	        }
	  
	        if (sum == n) {
	        	return true;
	        }
	        else {
	        	return false;
	        }
	  
	        
	    }
	  
	    public static void main(String[] args){
	    	
	    	Scanner sc = new Scanner(System.in);
			System.out.println("Please enter a number to find whether it is Perfect Number or not");
			int n = sc.nextInt();
			sc.close();
	        
	        if (isPerfect(n)) {
	        	System.out.println(n + " is a perfect number");
	        }
	        else {
	        	System.out.println(n + " is not a perfect number");   
	        }
	            
	    }

}
