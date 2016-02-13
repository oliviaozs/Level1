import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level1Exam implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton yellowButton = new JButton();
	JButton redButton = new JButton();
	JButton blueButton = new JButton();
	JButton greenButton = new JButton();

	public static void main(String[] args) {
		new Level1Exam().createUI();
	}

	void createUI() {
		frame.setTitle("Color Teacher");
		yellowButton.addActionListener(this);
		yellowButton.setBackground(Color.YELLOW);
		yellowButton.setOpaque(true);
		redButton.addActionListener(this);
		redButton.setBackground(Color.RED);
		redButton.setOpaque(true);
		blueButton.addActionListener(this);
		blueButton.setBackground(Color.BLUE);
		blueButton.setOpaque(true);
		greenButton.addActionListener(this);
		greenButton.setBackground(Color.GREEN);
		greenButton.setOpaque(true);
		panel.add(yellowButton);
		panel.add(redButton);
		panel.add(blueButton);
		panel.add(greenButton);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();
		if (buttonClicked == yellowButton) {
			speak("yellow");
		} else if (buttonClicked == redButton) {
			speak("red");
		} else if (buttonClicked == blueButton) {
			speak("blue");
		} else if (buttonClicked == greenButton) {
			speak("green");
		}

	}
}
