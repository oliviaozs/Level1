import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Date timeAtStart = new Date();
	int misses = 0;
	int moles = 0;

	public static void main(String[] args) {
		new WhackAMole().createUI();
	}

	void createUI() {
		frame = new JFrame();
		panel = new JPanel();
		frame.setSize(300, 300);
		frame.add(panel);
		drawButtons(24);
		frame.setVisible(true);
	}

	void drawButtons(int numberOfButtons) {
		int moleButton = new Random().nextInt(numberOfButtons);
		for (int i = 0; i < numberOfButtons; i++) {
			if (i == moleButton) {
				JButton button = new JButton("mole!");
				button.addActionListener(this);
				panel.add(button);
			} else {
				JButton button = new JButton();
				button.addActionListener(this);
				panel.add(button);
			}
		}

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private long time() {
		Date timeAtEnd = new Date();
		long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
		long gameInSeconds = (gameDuration / 1000) % 60;
		return gameInSeconds;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String chosenText = ((JButton) e.getSource()).getText();
		if (chosenText.equals("mole!")) {
			System.out.println("mole!");
			moles++;
			frame.dispose();
			createUI();
			if (moles == 10) {
				JOptionPane.showMessageDialog(null, "it took you "+time()+" seconds to hit 10 moles");
				System.exit(0);
			}
		} else {
			System.out.println("miss");
			misses++;
			if (misses == 5) {
				frame.dispose();
				createUI();
				misses = 0;
			}

		}

	}
}
