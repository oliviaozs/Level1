import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator implements ActionListener {
	JFrame frame = new JFrame("calculator");
	JPanel panel = new JPanel();
	JButton addButton = new JButton("add");
	JButton subtractButton = new JButton("subtract");
	JButton multiplyButton = new JButton("multiply");
	JButton divideButton = new JButton("divide");
	//JButton compute =  new JButton("compute");
	JTextField entry1 = new JTextField(10);
	JTextField entry2 = new JTextField(10);
	JPanel panel2 = new JPanel();

	public static void main(String[] args) {
		new SimpleCalculator().createUI();
	}

	void createUI() {
		addButton.addActionListener(this);
		addButton.setForeground(Color.BLUE);
		subtractButton.addActionListener(this);
		subtractButton.setForeground(Color.GREEN);
		multiplyButton.addActionListener(this);
		multiplyButton.setForeground(Color.RED);
		divideButton.addActionListener(this);
		divideButton.setForeground(Color.ORANGE);
		panel.setBackground(Color.DARK_GRAY);
		panel.add(entry1);
		panel.add(entry2);
		//createButtons();
		panel.add(addButton);
		panel.add(subtractButton);
		panel.add(multiplyButton);
		panel.add(divideButton);
		//panel.add(compute);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}

	void createButtons() {
		for (int i = 0; i < 10; i++) {
			JButton button = new JButton();
			String num = i+"";
			button.setText(num);
			panel.add(button);
		}
	}

	int multiply(int number1, int number2) {
		return number1 * number2;
	}

	int add(int number1, int number2) {
		return number1 + number2;
	}

	int subtract(int number1, int number2) {
		return number1 - number2;
	}

	double divide(double number1, double number2) {
		return number1 / number2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int num1 = Integer.parseInt(entry1.getText());
		int num2 = Integer.parseInt(entry2.getText());
		
		if (e.getSource() == addButton) {
			JOptionPane.showMessageDialog(null, add(num1, num2));
			
		} else if (e.getSource() == subtractButton) {
			JOptionPane.showMessageDialog(null, subtract(num1, num2));
			
		} else if (e.getSource() == multiplyButton) {
			JOptionPane.showMessageDialog(null, multiply(num1, num2));
			
		} else if (e.getSource() == divideButton) {
			JOptionPane.showMessageDialog(null, divide(num1, num2));
			
		}
		
		
	}

}
