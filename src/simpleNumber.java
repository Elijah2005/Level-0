import javax.swing.JOptionPane;

public class simpleNumber {
public static void main(String[] args) {
	String number1 = JOptionPane.showInputDialog("please type in a number");
	String number2 = JOptionPane.showInputDialog("another number");
	String number3 = JOptionPane.showInputDialog("another one");	
	int num1= Integer.parseInt(number1);
	int num2= Integer.parseInt(number2);
	int num3= Integer.parseInt(number3);
}
}
