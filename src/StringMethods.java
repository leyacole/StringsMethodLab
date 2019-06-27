
public class StringMethods {
	
public static String capitalize(String word) {
		
		String first;
		String restofWord;
		String newWord;
				
        first = word.substring(0, 1).toUpperCase();
        restofWord = word.substring(1).toLowerCase();
        newWord = (first + restofWord);
        return newWord;
	}
	
	public static int wheresWaldo(String phrase) {
		
		int findWaldo;
		
		findWaldo = phrase.indexOf("Waldo");
		
		return findWaldo;
					
	}
	
	public static String firstThingsFirst(String a, String b) {
		
		String newPhrase;

		
		if (a.charAt(0) < b.charAt(0)) {
			newPhrase = (a + " " + b);
		}
		else {
			newPhrase = (b + " " + a);
		}
		return newPhrase;
		
	}
	
	public static String reverse(String s) {  
		
		String reverseString;
		
        StringBuilder str_build = new StringBuilder();
        
        for(int i = s.length() - 1; i >= 0; i--)
        {
            str_build.append(s.charAt(i));
        }
        
        reverseString = str_build.toString();
        
        return reverseString;
       
	}
		
			
	public static void soLong(String a, String b) {
		
		if (a.length() < b.length()) {
			System.out.println(b);
		}
		else if ((a.length() > b.length())) {
			System.out.println(a);
		}
		else {
			System.out.println(a + " " + b);
		}
		
	}
	
	/*public static void afterMath(String phrase) {  //doesn't work
		phrase.substring("math");
		System.out.println(phrase);
		
		
	}*/
	
	public static void letterSize(String word) {
		
		for (int i = 0; i < word.length(); ++i) {
			char character = word.charAt(i);
			System.out.println(character );
		}
	}


}
