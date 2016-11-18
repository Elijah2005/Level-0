import java.util.Random;
import org.jointheleague.graphical.robot.Robot;

public class CodingExercise {
public static void main(String[] args) {
int bases = new Random().nextInt(5);
Robot eli = new Robot();
if(bases == 0){
	System.out.println("The batter is out");
}else if(bases == 1){
	System.out.println("The batter hit a single");
}else if(bases == 2){
	System.out.println("The batter hit a double");
	
}else if(bases==3){
	System.out.println("The batter hit a triple");
	
}else if(bases==4){
	System.out.println("The batter hit a home run");
}
eli.turn(135);
eli.penDown();
for (int i = 0; i <bases; i++) {
eli.turn(-90);
eli.move(200);
}
}
}
