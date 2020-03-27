package Lab4.java;
/*
 * /**
Develop an application that accepts a one word message from the user as input. The application should then encode the word and output the encoded word by reversing the word and replacing all of the vowels with numbers as
follows: a = 1, e = 5, i = 9, o = 15 and u = 21.
For example, if the user enters Programming the application should create the new word:
gn9mm1rg15rP
*/
import java.util.*; 
public class Encoder {

	public static void main(String[] args) {
		// declarations
		String word;
		
		Scanner keyboard = new Scanner(System.in);
		
		//input
		
		System.out.println("Enter one word:");
		word = keyboard.next();
		//create an object of type string buffer to built the encoded word
		StringBuffer sb = new StringBuffer();
		
		
		//len - number of characters in the word
		int len = word.length();
		for(int i = len -1; i>=0; i--) {
			//retrieve the char from the word located at the index i and stoer in the variable
			char l = word.charAt(i);
			if(l == 'a' || l =='A') {
				sb.append(l);
			}else if(l=='i' || l=='A') {
				sb.append(9);
			}else if(l=='e' || l=='E') {
				sb.append(5);
			}else if(l=='o' || l=='O') {
				sb.append(15);
			}else if(l=='u' || l=='U') {
				sb.append(21);
			}else{
				//if the letter is not vowels then add the letter itself to coded word
				sb.append(l);
			}
		}//for
		//store the encoded word in to a String variable to convert the StringBuffer object to string object
		String encoded = sb.toString();
		System.out.println("Encoded word: " + encoded);
		
		
	}//main

}//class
