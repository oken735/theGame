package theGame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game {
	public static void main(String[] args) {
		JFrame frame = new JFrame("sweetnesss");
		JPanel panel = new JPanel();
		JLabel label1 = new JLabel("this is gona be sweet");
		panel.add(label1);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
	}
}
