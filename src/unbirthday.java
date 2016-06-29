import javax.swing.JOptionPane;

public class unbirthday{
	public static void main(String[] args) {
		String day =JOptionPane.showInputDialog("whats your birthday");
		System.out.println(day);
		int  birth = Integer.parseInt(day);
		if(birth == 628){
			JOptionPane.showMessageDialog(null, "Happy birthday");
		}
			
	}
}
