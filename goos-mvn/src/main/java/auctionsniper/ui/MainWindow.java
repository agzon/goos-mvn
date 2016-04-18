package auctionsniper.ui;

import javax.swing.JFrame;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = -7744905942382890972L;
	public static final String MAIN_WINDOW_NAME = "Auction Sniper Main";
	  
	public MainWindow() {
		super("Auction sniper");
		setName(MAIN_WINDOW_NAME);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
