import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
	private static final int WIDTH = 10;
	private static final int HEIGHT = 20;
	
	
	public void init() {
		//screen = new Screen(WIDTH, HEIGHT, new SpriteSheet(ImageIO.read(Main.class.getResourceAsStream("/res/icons.png")))));
	}

	public static void main(String[] args) {
		GridLayout layout = new GridLayout(HEIGHT, WIDTH);
		JFrame frame = new JFrame("Tetris");
		frame.setLayout(layout);
		
		Tetromino mino = new Tetromino();
		System.out.println(mino.getShape());
		
		for(int i = 0; i < (layout.getRows()*layout.getColumns()); i++) {
			JLabel label = new JLabel();
			label.setPreferredSize(new Dimension(HEIGHT, WIDTH));
			label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			frame.add(label);
		}
		
		frame.setLayout(layout);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}

}
