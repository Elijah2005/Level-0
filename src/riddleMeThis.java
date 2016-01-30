import javax.swing.JOptionPane;

public class riddleMeThis {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int number = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/the-riddler
String a= JOptionPane.showInputDialog("You draw a line. Without touching it, how do you make the line longer");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null," your score is " + number);
	}
}
