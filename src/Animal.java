import javax.swing.JOptionPane;

public class Animal {
	public static void main(String[] args) {
		
	

String animal =	JOptionPane.showInputDialog("What is your favorite animal");
if (animal.equals("Dog")) {
	System.out.println("Dogs go woof");
}else{
	System.out.println("I dont know that animal");
}
if(animal.equals("Cat")){
	System.out.println("Cats go meow");
}else{
	System.out.println("I dont know that animal");
}
	
	}
}
