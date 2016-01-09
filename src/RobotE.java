import org.jointheleague.graphical.robot.Robot;

public class RobotE {
public static void main(String[] args) {
	Robot E =new Robot();
	
	E.setSpeed(100);	
E.penDown();
E.move(300);
E.turn(90);
E.move(100);
E.penUp();
E.turn(90);
E.move(100);
E.penDown();
E.turn(90);
}
}
