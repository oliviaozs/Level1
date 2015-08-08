import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton joke = new JButton();
	JButton punchline = new JButton();

	public static void main(String[] args) {
		ChuckleClicker clicker = new ChuckleClicker();
		clicker.makeButtons();

	}

	private void makeButtons() {
		frame.setSize(200, 60);
		joke.addActionListener(this);
		punchline.addActionListener(this);
		joke.setText("joke");
		punchline.setText("punchline");
		panel.add(joke);
		panel.add(punchline);
		frame.add(panel);
		frame.show();
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == joke) {
			JOptionPane.showMessageDialog(null, "why was the voltaic cell arrested");
		}
		else if (arg0.getSource() == punchline) {
			JOptionPane.showMessageDialog(null, "for a salt and battery");
		}
	}
}
