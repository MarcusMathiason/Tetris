import java.awt.image.BufferedImage;
import java.util.Random;

public class Tetromino {
	private Random rand = new Random();
	private enum shapes {
			I, O, T, J, L, S, Z
	};
	private String shape;
	private BufferedImage img;
	
	public Tetromino(BufferedImage img) {
		shape = shapes.values()[rand.nextInt(shapes.values().length)].toString();
		this.img = img;
	}
	
	public BufferedImage getSprite() {
		switch(shape) {
		case "I" : 
			return img.getSubimage(0, 0, 8, 8);
		case "O" : 
			return img.getSubimage(9, 0, 8, 8);
		case "T" : 
			return img.getSubimage(17, 0, 8, 8);
		case "J" : 
			return img.getSubimage(25, 0, 8, 8);
		case "L" :
			return img.getSubimage(33, 0, 8, 8);
		case "S" : 
			return img.getSubimage(41, 0, 8, 8);
		case "Z" : 
			return img.getSubimage(49, 0, 8, 8);
		default	:
			return null;
		}
	}
	
	public String getShape() {
		return this.shape;
	}
	
}
