
	import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
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
		private static ArrayList<Cell> grid;
	
		public static void init() {
			try {
				img = ImageIO.read(new File("res/icons.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
	
			grid = new ArrayList<Cell>();
			
				for (int i = 0; i < (layout.getRows() * layout.getColumns()); i++) {
					System.out.println(i);
					mino = new Tetromino(img);
					
					Cell cell = new Cell();
					
					cell.setXPos((i%10) + 1);
					cell.setYPos((i/10) + 1);
					
					//JLabel cell = new JLabel();
					System.out.println("Label x: " + cell.getXPos());
					System.out.println("Label y: " + cell.getYPos());
					
					cell.setIcon(new ImageIcon(mino.getSprite()));
					
					
					frame.add(cell);
				}
		}
	
		public static void main(String[] args) {
	
			layout = new GridLayout(HEIGHT, WIDTH);
	
			frame = new JFrame("Tetris");
			frame.setLayout(layout);
			frame.setResizable(false);
			init();
			frame.pack();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
			frame.setVisible(true);
			
	
		}
	
	}
