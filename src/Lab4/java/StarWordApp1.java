package Lab4.java;
import java.util.*;

public class StarWordApp1 {

	public static void main(String[] args) {
		String word;
		int computeMethodNumber;
		Scanner sc = new Scanner(System.in);
		
		boolean running = true;
		do {
			StarWord1 starWord1 = new StarWord1();
			System.out.println("Please enter a word: ");
			word = sc.next().toLowerCase();
			starWord1.setWord(word);
			
			System.out.println("Please choose the number of which method to use: 1 - computeVowels, 2 - computeStars, 3 - computePigLatin, 4 - reverseWord");
			computeMethodNumber = sc.nextInt();
			
			switch(computeMethodNumber) {
			case 1:
				starWord1.computeVowels();
				System.out.println("The word: " + word + " with vowels method is: " + starWord1.getStringBuffer());
				break;
			case 2:
				starWord1.computeStars();
				System.out.println("The word: " + word + " with stars method is: " + starWord1.getStringBuffer());
				break;
			case 3:
				starWord1.computePigaLatin();
				System.out.println("The word: " + word + " with Pig Latin method is: " + starWord1.getStringBuffer());
				break;
			case 4:
				starWord1.reverseWord();
				System.out.println("The word: " + word + " with word reverse method is: " + starWord1.getStringBuffer());
				break;
				default:
					System.out.println("Wrong input");
			}//switch
			
			System.out.println("==================================");
			System.out.println("Do you wish to continue? (choose y/n)");
			String answer = sc.next().toLowerCase();
			if(answer.equals("n")) {
				running = false;
				System.out.println("The program has finished.");
			}
			
		}//do
		while (running);
	}//main

}//class
