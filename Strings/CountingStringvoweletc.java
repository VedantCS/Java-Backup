package Strings;
import java.util.Scanner;
public class CountingStringvoweletc {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        int alphabets = 0, vowels = 0, consonants = 0, digits = 0, specialSymbols = 0;

	        for (char ch : input.toCharArray()) {
	            if (Character.isLetter(ch)) { //Character Class methods: isDigit(character),isLetter(character)..if dont want to use this,do the long cut way shown below
	                alphabets++;
	                if ("AEIOUaeiou".indexOf(ch) != -1) {
	                    vowels++;
	                } else {
	                    consonants++;
	                }
	            } else if (Character.isDigit(ch)) {
	                digits++;
	            } else {
	                specialSymbols++;	
	            }
	        }
//another character class method: Character.isLetterOrDigit(ch)
	    
	        System.out.println("Total Alphabets: " + alphabets);
	        System.out.println("Total Vowels: " + vowels);
	        System.out.println("Total Consonants: " + consonants);
	        System.out.println("Total Digits: " + digits);
	        System.out.println("Total Special Symbols: " + specialSymbols);
	        scanner.close();
}}
/* ------------------LONGER SOLUTION-------------
for (char ch : input.toCharArray()) {

if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
    alphabets++;
    
    if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
        ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        vowels++;
    } else {
        consonants++;
    }
}
// Check for digits (0-9)
else if (ch >= '0' && ch <= '9') {
    digits++;
}

else {
    specialSymbols++;
}
}
*/