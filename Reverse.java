/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String original = args[0]; //gets string from user
		char middleChar = original.charAt(original.length() / 2); //saves the middle char
		String reverse = ""; //defines the string that will become the reverse
		while (original.length()>0){ //creates a loop that runs as long as the original string has chars
			reverse = reverse + original.charAt(original.length() - 1); //adds the last char of the original string to the reverse string
			original = original.substring(0, original.length() - 1); //shortens the original by the last char
		}
		System.out.println(reverse); //prints the reverse string
		System.out.println("The middle character is "+middleChar); //prints the middle char
		
	}
}
