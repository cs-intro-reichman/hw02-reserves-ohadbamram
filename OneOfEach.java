
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		double r1 = 0; 
		int boys = 0;
		int girls = 0;
		String msg1 = ""; //makes 3 variables, one for the random generator, one for each gender count, and one for the message
		while(boys < 1 || girls < 1){ //a loop that runs until both boys and girls at least 1
			r1 = Math.random(); //generates a random number from 0.0 to 0.9
			if(r1 <= 0.4){ //if the number is 0.4 or less, adds 1 boy to the count and to the message
				boys += 1;
				msg1 += "b ";
			}else{ //otherwise adds 1 girl to the count and to the message
				girls += 1;
				msg1 += "g ";
			}			
		}
		System.out.println(msg1);
		System.out.println("You made it... and you now have " + (boys + girls) + " children."); //outputs the message and amount of kids
	}
}
