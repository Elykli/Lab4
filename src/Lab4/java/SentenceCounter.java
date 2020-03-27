package Lab4.java;
/**
"I love Java."
SentenceCounter -- counts the number of words in a given sentence. We 
assume that a word is separated from another word by ONE single space 
character.
*/
import java.util.*;
public class SentenceCounter {

	public static void main(String[] args) {
		// declare a variable to store sentence entered by the user
		String sentence;
		
		//declare a variable of type scanner and then create an object of type scanner
		Scanner keyboard = new Scanner(System.in);
		
		//input
		System.out.println("Please enter sentence:");
		sentence = keyboard.nextLine();
		
		int counter = 0;
		int length = sentence.length();//the number of char
		//declare a control variable
		int i = 0;
		
		while (i<length) {//while all the cars have not been traversed yet
			//retrieve the char from sentence located at the index i
			//store it into the variable c
			char c = sentence.charAt(i);
			//check whether the current char has a space ''
			
			if(c ==' ') {
				counter ++;//increase the counter ++ that keeps track of the number of words seen so far
				
				
			}
			//progression to the next interaction
			i++;
		}//while
		counter +=1;
		//output
		System.out.println("Sentence counter: " + counter);
		
	}//main

}//class
