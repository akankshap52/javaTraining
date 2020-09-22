package assignment1;

import java.util.Scanner;

public class Vowels {
		
	public String countVowels(String val) {
		String flag = null;
		for (int i= 0 ; i < val.length(); i++ ) {
			char c=val.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {
				flag = "yes" ;
			}
			else flag = "No"; 
		}
			
		return flag;
		
	}
	public static void main(String[] args) {
		String a;
		
		Scanner vowel = new Scanner(System.in);
		System.out.println("Enter STring");
		Vowels vowels = new Vowels();
		 a = vowel.nextLine();
		System.out.println("Does STring have vowels? " + new Vowels().countVowels(a));

	}

}
