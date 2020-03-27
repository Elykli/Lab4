package Lab4.java;

public class StarWord1 {
	
	String word;
	StringBuffer sb = new StringBuffer();
	
	public void StarWord() {
		
	}
	
	public void setWord(String w) {
		this.word = w;
	}
	
	public void computeVowels() {
		int i = 0;
		while( i < word.length()) {
			char c = word.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				sb.append(c);
			}
			i++;
		}
	}//vowels
	
	public void computeStars() {
		int length = word.length();
		for(int i = 0; i < length; i++) {
			sb.append('*');
		}
	}//stars
	
	public void computePigaLatin() {
		int i = 1;
		while(i< word.length()) {
			char c = word.charAt(i);
			sb.append(c);
			i++;
		}
		sb.append(word.charAt(0));
		sb.append("ay");
	}//pigLatin
	
	public void reverseWord() {
		for(int i = word.length() - 1; i >= 0; i--) {
			char letter = word.charAt(i);
			sb.append(letter);
		}	
	}//reverseWord
	
	public String getStringBuffer() {
		return sb.toString();
	}
	

}//class
