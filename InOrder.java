/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int r1 = (int) (Math.random() * 10); 
		int r2 = (int) (Math.random() * 10); //generates two random numbers between 0 and 9
		String display = "" + r1; //prints the first number
		 while(r1 <= r2){ //a loop that works as long as the second number is greater or equal to the first
			r1 = r2;
			display = display + " " + r1;			
			r2 = (int) (Math.random() * 10); //if the second number isn't smaller, it adds it to the display and generates a new second number
			
		}
		
		System.out.println(display); //prints all the random numbers that are form a non-decreasing sequence 
		
	}
}
