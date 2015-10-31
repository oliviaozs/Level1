import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EasyButton implements MouseListener, ActionListener {
	public static void main(String[] args) {
		new EasyButton();
		
	}

	/*
	 * Use the methods below to make an easy button show on the screen. 
	 * When clicked, it says some very annoying words.
	 */
	public EasyButton(){
		
		showEasyButton();
		//easyButtonImage.addMouseListener(this);
		button.addActionListener(this);
		button2.addActionListener(this);
	}

	JLabel easyButtonImage;
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	private void showEasyButton() {
		
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		URL url = null;
		try {
			url = new URL(
					"https://github.com/jointheleague/league-images/blob/master/easy_button.jpg?raw=true");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		Icon icon = new ImageIcon(url);
		this.easyButtonImage = new JLabel(icon);
		quizWindow.add(easyButtonImage);
		quizWindow.add(panel);
		panel.add(button);
		panel.add(button2);
		button2.setText("button 2");
		button.setText("button 1");
		quizWindow.pack();
	}

	private void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		speak("that was easy");
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton button3 = (JButton)arg0.getSource();
		//System.out.println(arg0.getSource());
		if(button == button3){
			System.out.println("button 1");
		}
		else if (button2 == button3){
			System.out.println("button 2");
		}
		
		// TODO Auto-generated method stub
		
	}

}
