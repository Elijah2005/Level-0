// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {
		
		boolean isWeekday, isVacation;
		
		
		
		
		 // Ask the user for these values using
	int day = JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
		  JOptionPane.YES_NO_OPTION);
		 int days = JOptionPane.showConfirmDialog(null, "is it a vacation");
		 if(day==JOptionPane.NO_OPTION){
			 isWeekday = false;
			 System.out.println("Sleep in");
		 }else{
			 isWeekday = true;
			 System.out.println("Get up lazybones");
		 }
		 if(days==JOptionPane.NO_OPTION){
			 isVacation = false;
			 System.out.println("Get up lazybones");
		 }else{
			 isVacation = true;
			 System.out.println("Sleep in");
		 }
				 
			 
		 
	

		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
		 * 
		 * print “get up lazybones!” If it is a weekday, and we are on vacation,
		 * print “sleep in”.
		 */
	}
}
	





