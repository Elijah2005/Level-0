import javax.swing.JOptionPane;

public class WarmUp {

	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			String input = JOptionPane.showInputDialog("What is the best game in the world");
		JOptionPane.showMessageDialog(null, input+" is awesome");	
		}
		
	}
}
