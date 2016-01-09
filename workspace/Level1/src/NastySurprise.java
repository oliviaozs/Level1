import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("trick");
	JButton button2 = new JButton("treat");

	public static void main(String[] args) {
		new NastySurprise().createUI();
	}

	void createUI() {
		button1.addActionListener(this);
		button2.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1){
			showPictureFromTheInternet("http://www.pekelman.com/presentations/apidays/images/pig-hog.jpg");
		}
		else if (e.getSource() == button2){
			showPictureFromTheInternet("http://40.media.tumblr.com/7e7f55795d6c6dc6d43dfc7b007ebb9b/tumblr_mr7a3dHB9u1sdrnfzo1_1280.jpg");
		}
		
	}

}
