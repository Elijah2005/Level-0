
// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {

		// 2. Make a variable that will hold a random number and put a random number into this variable using "new
		// Random().nextInt(4)"
		int money = new Random().nextInt(4);

		// 3. Print out this variable
		//JOptionPane.showMessageDialog(null, money);
		// 4. Get the user to enter a question for the 8 ball
		JOptionPane.showInputDialog("enter a question");
		// 5. If the random number is 0
		if (money == 0) {
			// -- tell the user "Yes"
			JOptionPane.showMessageDialog(null, "yes");
		}
		// 6. If the random number is 1
		if (money == 1) {
			// -- tell the user "No"
			JOptionPane.showMessageDialog(null, "no");
		}
		// 7. If the random number is 2
		if (money == 2) {
			// -- tell the user "Maybe you should ask Google?"
			JOptionPane.showMessageDialog(null, "Maybe you should ask google");
		}
		// 8. If the random number is 3
		if (money == 3) {
			// -- write your own answer
			if(money==5){
				JOptionPane.showMessageDialog(null, "Your way off");
		}
	}

}
	
}
