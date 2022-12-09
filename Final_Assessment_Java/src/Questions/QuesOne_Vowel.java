package Questions;

import java.util.Scanner;

public class QuesOne_Vowel {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String to Check:  ");
		
		String str = input.nextLine();
		int i;
		for(i=0;i<str.length();i++) {
			if(str.contains("a") || str.contains("e") || str.contains("i")|| str.contains("o")|| str.contains("u")) {
				System.out.println("The Entered String contains a vowel.");
				break;
			}
		}
		if(i==str.length()) {
			System.out.println("The entered string doesn't contain a vowel.");
		}
		
		
		input.close();
	}


}
