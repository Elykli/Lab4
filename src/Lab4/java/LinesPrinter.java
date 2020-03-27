package Lab4.java;
import java.util.*;
public class LinesPrinter {

	public static void main(String[] args) {
		//declare local variables
		String word;
		
		Scanner input = new Scanner(System.in);
		
		//input
		System.out.println("Enter one word: ");
		word = input.next();
		
		//counter control loop
		//printer
		//01234
		int length = word.length();
		for (int i = 0; i<length; i++) {
			//retrieve the letter from at index i
			char letter = word.charAt(i);
			//print on each line a letter
			//System.out.println(letter);
			
			//print star ******
			System.out.println("*");
		}
		System.out.println();
		//counter control loop to reverse the word
		for(int i=length - 1; i>=0; i--) {
			//retrieve the letter from index i
			char w = word.charAt(i);
			System.out.print(w);
			
		}
	}
	

}
