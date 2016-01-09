import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addButton = new JButton("add");
	JButton subtractButton = new JButton("subtract");
	JButton multiplyButton = new JButton("multiply");
	JButton divideButton = new JButton("divide");
	JTextField number1 = new JTextField();
	JTextField number2 = new JTextField();

	public static void main(String[] args) {
		new SimpleCalculator().createUI();
	}

	void createUI() {
		addButton.addActionListener(this);
		subtractButton.addActionListener(this);
		multiplyButton.addActionListener(this);
		divideButton.addActionListener(this);
		panel.add(number1);
		panel.add(number2);
		panel.add(addButton);
		panel.add(subtractButton);
		panel.add(multiplyButton);
		panel.add(divideButton);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}

	int multiply(int number1, int number2) {
		return number1*number2;
	}
	
	int add(int number1, int number2) {
		return number1 + number2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
