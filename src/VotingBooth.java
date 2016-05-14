import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String Name = JOptionPane.showInputDialog("Who would you vote for");
		if (Name.equals("trump")) {
			JOptionPane.showMessageDialog(null, " You are sick and I hate you");
		} else {
			String Number = JOptionPane.showInputDialog("How old are you");
			int num = Integer.parseInt(Number);
			if (num >= 18) {
				JOptionPane.showMessageDialog(null, "Your too young and nobody cares about you");
				JOptionPane.showMessageDialog(null, "You voted for" + Name);
			}
		}

	}
}