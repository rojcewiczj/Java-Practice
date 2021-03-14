import java.util.*;

class Program {

  public String reverseWordsInString(String string) {
    ArrayList<String> words = new ArrayList<String>();
		int startOfWord = 0;
		
		for(int idx = 0; idx < string.length(); idx++){
			char character = string.charAt(idx);
			if(character == ' '){
				words.add(string.substring(startOfWord, idx));
				startOfWord = idx;
			} else if(string.charAt(startOfWord) == ' '){
				words.add(" ");
				startOfWord = idx;
			}
		}
		
		words.add(string.substring(startOfWord));
		Collections.reverse(words);
    return String.join("", words);
  }
}
