/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int x = Integer.parseInt(args[0]); //gets an integer from the user
		int sum = 0; //creates a sum of divisors
		String message = x + " is a perfect number since " + x +" = "; //first iteration of the message
		for(int i = 1; i < x - 1; i++){ //makes a loop that runs through all the numbers from 1 to x
			if(x % i == 0){ //checks if i is a divisor of x
				message = message + i + " + "; //if so, adds i to the message 
				sum += i; //adds i to the total sum of divisors
			}
		}
		message = message.substring(0, message.length() - 3); //takes the last 3 chars out of the string (" + ")
		if(x != sum || x == 0){ //if the number is not equal to the sum of it's divisors or equals 0, changes the message to not a perfect number
			message = x + " is not a perfect number";
		}
		System.out.println(message); //prints the message
	}
}
