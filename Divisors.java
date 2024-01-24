/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int x = Integer.parseInt(args[0]); //gets an integer from the user
		int k = 1; //forms a changeabke divisor to x
		while (k < x + 1){ //a loop that keeps running until k becomes greater than x
			if (x % k == 0){
				System.out.println(k); //prints out every number that divides x
			}
			k = k + 1;
		}
	}
}
