import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	
	public static void main(String[] args) {
		CutenessTV cute = new CutenessTV();
		cute.createUI();
	}

	private void createUI() {
		button1.setText("Goat");
		button2.setText("Waffles");
		button3.setText("Duck");
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		frame.add(panel);
		frame.pack();
		frame.setBackground(Color.ORANGE);
		frame.setLocation(900, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	void showGoat() {
		playVideo("wfpL6_0OBuA");
	}

	void showWaffles() {
		playVideo("Xp9kNepzNu8");
	}

	void showDuck() {
		playVideo("MtN1YnoL46Q");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI("https://www.youtube.com/v/" + videoID
					+ "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton button = (JButton)arg0.getSource();
		if (button == button1) {
			showGoat();
		}
		else if (button == button2) {
			showWaffles();
		}
		else if (button == button3) {
			showDuck();
		}
		
	}

}
