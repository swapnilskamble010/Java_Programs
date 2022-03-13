package day_5;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		
		boolean isVowel = false;
		System.out.println("Please Enter an Alphabet to check whether it is Vowel or Consonant");
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		sc.close();
		char alphabet = Character.toUpperCase(a);
		
		switch (alphabet) {
		
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': isVowel = true;
		
		}
		
		if (isVowel == true) {
			System.out.println("Alphabet is Vowel");
		}
		else if (alphabet > 'A' && alphabet < 'Z') {
			System.out.println("Alphabet is Consonant");			
		}
		else {
			System.out.println("Please Enter an Alphabet");
		}
	}

}
