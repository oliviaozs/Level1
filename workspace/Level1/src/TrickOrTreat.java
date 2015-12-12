import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TrickOrTreat {
	public static void main(String[] args) {
		new TrickOrTreat().createUI();
	}
	void createUI() {
		JFrame frame = new JFrame("happy halloween");
		
		JPanel panel = new JPanel();
		JButton trick = new JButton("trick");
		JButton treat = new JButton("treat");
		panel.add(trick);
		panel.add(treat);
		frame.add(panel);
		frame.pack();
		frame.setSize(500, 60);
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

}
