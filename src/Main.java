import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
	private static final int WIDTH = 10;
	private static final int HEIGHT = 20;
	private static BufferedImage img;
	private static Tetromino mino;
	private static JFrame frame;
	private static GridLayout layout;
	
	
	public static void init() {
		try {
			img = ImageIO.read(new File("res/icons.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i = 0; i < (layout.getRows()*layout.getColumns()); i++) {
			mino = new Tetromino(img);
			JLabel label = new JLabel();
			label.setIcon(new ImageIcon(mino.getSprite()));
			label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			frame.add(label);
		}
	}

	public static void main(String[] args) {
		
		layout = new GridLayout(HEIGHT, WIDTH);
		
		frame = new JFrame("Tetris");
		frame.setLayout(layout);
		
		init();
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}

}
