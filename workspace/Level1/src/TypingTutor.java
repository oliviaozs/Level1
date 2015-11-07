import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TypingTutor implements KeyListener {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	Date timeAtStart;
	char currentLetter;
	int correctLetters = 0;

	public static void main(String[] args) {
		TypingTutor tutor = new TypingTutor();
		tutor.createUI();
	}

	void createUI() {
		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");
		frame.add(label);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.setTitle("Typing Tutor");
		frame.pack();
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.addKeyListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
		Date timeAtEnd = new Date();
		long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
		long gameInSeconds = (gameDuration / 1000) % 60;
		double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
		int charactersPerMinute = (int) (charactersPerSecond * 60);
		System.out.println(gameInSeconds);
		JOptionPane.showMessageDialog(null, "Your typing speed is "
				+ charactersPerMinute + " characters per minute.");
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getKeyChar());
		if (timeAtStart == null)
		{
			 timeAtStart = new Date();
			
		}
		if (arg0.getKeyChar() == currentLetter) {
			frame.getContentPane().setBackground(Color.GREEN);
			System.out.println("correct");
			correctLetters ++;
		} else {
			frame.getContentPane().setBackground(Color.RED);
			System.out.println("wrong");
		}
		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getKeyCode() == KeyEvent.VK_ENTER){
			showTypingSpeed(correctLetters);
			
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
