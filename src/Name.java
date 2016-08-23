import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Name { 
	public static void main(String[] args) {
		Robot letters= new Robot("vic");
		letters.setSpeed(10);
		letters.sparkle();
		letters.penDown();
		letters.setPenColor(Color.CYAN);
		letters.setWindowColor(0, 100, 0);
		letters.turn(90);
		letters.move(300);
		letters.turn(180);
		letters.move(300);
		letters.turn(90);
		letters.move(300);
		letters.turn(90);
		letters.move(300);
		letters.turn(180);
		letters.move(300);
		letters.turn(90);
		letters.move(200);
		letters.turn(90);
		letters.move(300);
		letters.penUp();
		letters.turn(180);
		letters.move(600);
		letters.turn(250);
		letters.penDown();
		letters.move(500);
		letters.turn(180);
		letters.move(250);
		letters.turn(290);
		letters.move(150);
		letters.turn(100);
		letters.turn(180);
		letters.move(250);
		letters.turn(180);
		letters.move(580);
		
	}
}
