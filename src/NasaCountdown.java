import javax.swing.JOptionPane;

public class NasaCountdown {
	public static void main(String[] args) {
		// 2. ask the user when to start (JOptionPane.showInputDialog)

		String blastoff = JOptionPane.showInputDialog(null, "what number do you not want to start at");
		// 3. convert the user's answer to an int (Integer.parseInt)
		int start = Integer.parseInt(blastoff);

		// 4. countdown from user's starting point
		// 1. countdown from 10 to 0
		for (int i = start; i > 0; i--) {
			speak("" + i);
		}

		// 5. when the counting is done, print "blastoff!"
		speak("blast off!");
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
