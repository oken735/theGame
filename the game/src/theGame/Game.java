package theGame;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game implements ActionListener {
	
	private JFrame menu,settings;
	private JButton startb,setb,quitb,b1,b2,b3;
	private JPanel sp,mp;
	
	Game() {
		this.menu = new JFrame();
		this.startb = new JButton("Start");
		this.setb = new JButton("Settings");
		this.quitb = new JButton("Quit");
		this.mp = new JPanel();
		mp.add(startb);
		mp.add(setb);
		mp.add(quitb);
		menu.add(mp);
		startb.addActionListener(this);
		setb.addActionListener(this);
		quitb.addActionListener(this);
		menu.pack();
		this.settings = new JFrame();
		this.b1 = new JButton("something");
		this.b2 = new JButton("another thing");
		this.b3 = new JButton("back");
		this.sp = new JPanel();
		sp.add(b1);
		sp.add(b2);
		sp.add(b3);
		b3.addActionListener(this);
		settings.add(sp);
		settings.pack();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="Start") {
			//stuff happens
		}
		if(e.getActionCommand()=="Settings") {
			menu.setVisible(false);
			settings.setVisible(true);
		}
		if(e.getActionCommand()=="Quit") {
			System.exit(0);
		}
		if(e.getActionCommand()=="back") {
			menu.setVisible(true);
			settings.setVisible(false);
		}
	}
	public static void main(String[] args) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Game game = new Game();
		game.menu.setVisible(true);
		game.settings.setVisible(false);
		final JFrame frame = new JFrame("sweetnesss");
		JPanel panel = new JPanel();
		JLabel label1 = new JLabel("this is gonna be sweet");
		label1.setFont(new Font("Serif", Font.PLAIN, 36));
		panel.add(label1);
		frame.add(panel);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	private static void setDefaultCloseOperation(int exitOnClose) {
	}
}
