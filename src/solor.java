
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import org.teachingextensions.logo.Colors;
import java.awt.*;
import org.teachingextensions.logo.Tortoise;

public class solor {
	public static void main(String[] args) {

		// 3. ask the user what color they would like the tortoise to draw
		String color = JOptionPane.showInputDialog("What color do you want the pen color to be");
		// 4. use an if/else statement to set the pen color that the user
		// requested
		for(int i=0;i<5;){
		if (color.equals("Blue")) {
			Tortoise.setPenColor(Color.blue);
		}
		if (color.equals("Red")) {
			Tortoise.setPenColor(Color.red);
		}
		if (color.equals("Green")) {
Tortoise.setPenColor(Color.green);
		}

		// 5. if the user doesn’t enter anything, choose a random color
		Colors.getRandomColor();
		// 6. put a loop around your code so that you keep asking the user for
		// more colors & drawing them

		// 2. set the pen width to 10
		Tortoise.setPenWidth(10);
		// 1. make the tortoise draw a shape (this will take more than one line
		// of code)
		Tortoise.penDown();
		Tortoise.move(100);
		Tortoise.turn(90);
		Tortoise.move(100);
		Tortoise.turn(90);
		Tortoise.move(100);
		Tortoise.turn(90);
		Tortoise.move(100);
		}
	}
}
