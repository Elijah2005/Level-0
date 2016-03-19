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
public class AirlineRegistration {
	
	public static void main(String[] args) {
		String sleepy=JOptionPane.showInputDialog("What is your first name");
		String seepy=JOptionPane.showInputDialog("Whats your last name");
		String sepy=JOptionPane.showInputDialog("where is the airport you are in");
		String spy=JOptionPane.showInputDialog("What is your birthday im a spy");
		String sy=JOptionPane.showInputDialog("What is your gender Im a stalker");
		JOptionPane.showMessageDialog(null, seepy + " / "+ sleepy + " (" + spy + ")");
		
	}
	
}




