
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;


import org.teachingextensions.logo.Tortoise;


public class SpiralMaker {
	static int sides = 0;
	public static void main(String[] args) {
		//Tortoise e = new Tortoise();
		// 3. Make a variable to hold the number of sides and set it to 0
		
		// 4. Ask the user which spiral they would like (square, triangle, or pentagon)
		String input = JOptionPane.showInputDialog("Square,Triange,or Pentagon");
		// 5. Set the number of sides depending on what the user entered (multiple lines of code)
		
		if(input.equalsIgnoreCase("Square")){
			sides = 360/4;			
		}else if(input.equalsIgnoreCase("Triangle")){
			sides = 360/3;	
		}else if(input.equalsIgnoreCase("Pentagon")){
			sides = 360/5;
		}else{
			System.out.println("error");
		}
		
		
		
		// 6. If the user enters something else, say "Sorry, I don't know how to draw a ..."
	
		
		// 1. Make the Tortoise draw a square spiral shape. If you get stuck, use these instructions: http://bit.ly/YJUO
		
		
		// 2. Change your code to turn the square spiral into a triangle spiral
		for (int j = 0; j < 80; j++) {
			Tortoise e = new Tortoise();
			e.setSpeed(10);
			e.move(4*j);
			e.turn(sides);
		}
	}


}





