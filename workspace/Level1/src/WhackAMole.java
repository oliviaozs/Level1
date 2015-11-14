import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	public static void main(String[] args) {
		new WhackAMole().createUI();
	}

	void createUI() {
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

	@Override
	public void actionPerformed(ActionEvent e) {
		String chosenText = ((JButton) e.getSource()).getText();
		if (chosenText.equals("mole!")) {
			System.out.println("mole!");
			frame.dispose();
			createUI();
		} else {
			System.out.println("miss");
			speak("miss");
		}

	}
}
