import java.util.Scanner;

public class String_Demo {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
        //System.out.println("Enter your word");
        //String userWord = scnr.nextLine();
        //String word = scnr.nextLine();
        
        
        //String first = word.substring(0, 1).toUpperCase();
       //String restOfuserWord = word.substring(1).toLowerCase();
        //System.out.println(first + restOfuserWord);
        //char firstLetter = userWord.charAt(0);
       //String restOfuserWord = userWord.substring(1);

        //System.out.println(Character.toUpperCase(firstLetter) + restOfuserWord.toLowerCase());
        
		String phrase = "It's Wednesday!";
		
		//String Buffer and immutability demo
		String wordString = "tart";
		StringBuffer wordBuffer = new StringBuffer("tart");
		
		String wordString2 = wordString;
		StringBuffer wordBuffer2 = wordBuffer;
		
		wordString.concat("s");
		wordBuffer.append("s");
		
		System.out.println(phrase.contentEquals("It's Wednesday!"));
		System.out.println(phrase.equalsIgnoreCase("it's Wednesday!"));
		
		System.out.println(phrase.length());
		System.out.println(phrase.charAt(5));
		System.out.println("The char at 5 is " + phrase.charAt(5));
		System.out.println(phrase.indexOf("day"));
		System.out.println(phrase.indexOf("w"));
		System.out.println(phrase.startsWith("W"));
		System.out.println(phrase.endsWith("!"));
		System.out.println(phrase.toUpperCase());
		System.out.println(phrase.toLowerCase());
		System.out.println(phrase.substring(0, 4));
		System.out.println(phrase.substring(5));
		System.out.println(phrase.replace('d',  'z'));
		System.out.println(phrase.replaceAll("day!", "day, today!"));
		System.out.println(" \n \t Hug? Why.   ".trim());
		
		System.out.println(wordString);
		System.out.println(wordBuffer);
		
		System.out.println("S1 " + wordString);
		System.out.println("B1 " + wordBuffer);
		System.out.println("S2 " + wordString2);
		System.out.println("B2 " + wordBuffer2);
		
		
	}

}
