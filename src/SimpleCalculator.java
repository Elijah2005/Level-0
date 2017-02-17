import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator implements MouseListener{
	static SimpleCalculator e = new SimpleCalculator();
	static JTextField numberField1 = new JTextField(10);
	static JTextField numberField2 = new JTextField(10);
	static JButton addition = new JButton("addition");
	static JButton subtraction = new JButton("subtraction");
	static JButton multiplication = new JButton("multiplication");
	static JButton division = new JButton("division");
	
public static void main(String[] args){
	e.createUi();
}
public void createUi(){
	JFrame calculator = new JFrame();
	calculator.setSize(400, 400);
	JPanel panel = new JPanel();
	calculator.add(panel);
	panel.add(addition);
	panel.add(subtraction);
	panel.add(multiplication);
	panel.add(division);
	panel.add(numberField1);
	panel.add(numberField2);
	addition.addMouseListener(this);
	calculator.pack();
	calculator.setVisible(true);
	addition.addMouseListener(this);
	subtraction.addMouseListener(this);
	multiplication.addMouseListener(this);
	division.addMouseListener(this);
calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == addition) {
}
	else if (e.getSource()==subtraction) {
		
	}
	if (e.getSource()==multiplication) {
		
	}
	if (e.getSource()==division) {
		
	}
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

}
