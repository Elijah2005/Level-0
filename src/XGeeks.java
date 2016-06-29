
// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipies".
 */
public class XGeeks {
	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String jeff = "Being a fat bronie";
		String MLP = "killing the bronies";
		String Fat = "Being jeff";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String name = JOptionPane.showInputDialog("Pick one of my three names");
		// 3. Show the superpower in a pop-up, depending on the name entered.
		if (name.equals("jeff")) {
			System.out.println(jeff);
		}
		if (name.equals("MLP")) {

			System.out.println(MLP);
		}
		if (name.equals("Fat")) {
			System.out.println(Fat);
		}
	}
}
