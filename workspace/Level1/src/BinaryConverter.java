import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField input = new JTextField(20);
	JTextField output = new JTextField(20);
	JButton button = new JButton();

	public static void main(String[] args) {
		BinaryConverter converter = new BinaryConverter();
		converter.createUI();
	}

	void createUI() {
		button.setText("convert");
		panel.add(input);
		panel.add(button);
		panel.add(output);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		button.addActionListener(this);
	}

	String convert(String binary) {
		int asciivalue = Integer.parseInt(binary, 2);
		char theLetter = (char) asciivalue;
		return "" + theLetter;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		//System.out.println(convert(input.getText()));
		output.setText(convert(input.getText()));
		
	}
}
