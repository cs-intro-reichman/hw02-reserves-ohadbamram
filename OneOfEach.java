
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean boys = false;
		boolean girls = false;
		int sum = 0;
		String msg1 = ""; //makes 4 variables, one for the random generator, one for each gender, one to count, and one for the message
		while(!(boys && girls)){ //a loop that runs until both boys and girls are true
			double r1 = Math.random(); //generates a random number from 0.0 to 0.9
			if(r1 < 0.5){ //if the number is 0.4 or less, adds 1 boy to the count and to the message
				boys = true;
				msg1 += "b ";
			}else{ //otherwise adds 1 girl to the count and to the message
				girls = true;
				msg1 += "g ";
			}
			sum++;	
		}
		System.out.println(msg1);
		System.out.println("You made it... and you now have " + sum + " children."); //outputs the message and amount of kids
	}
}
