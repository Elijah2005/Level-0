// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class IknowWhatYouDidLastSumme {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your first name " );
		String LastName = JOptionPane.showInputDialog("What is your last name");
		String DestinationAirport = JOptionPane.showInputDialog("What airport are you in and whats the destination");
		String Birthday = JOptionPane.showInputDialog("For security reasons when is your birthday");
		String Gender = JOptionPane.showInputDialog("For security reasons what gender are you male,female,Donald Trumps hair");
		JOptionPane.showMessageDialog(null,"First name "+name +"\n Last name "+LastName +"\n Destination "+DestinationAirport +"\n Your birthday "+Birthday +"\n Your gender is"+Gender);
	}
}



/**Extra Difficult Challenge: have the program repeat until plane is full (10 passenger plan) and print out the number of passengers after each boarding pass.
*/

		
	


