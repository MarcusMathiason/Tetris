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
		//Light blue
		case "I" : 
			return img.getSubimage(16*0, 0, 16, 16);
		//Yellow
		case "O" : 
			return img.getSubimage(16*1, 0, 16, 16);
		//Purple
		case "T" : 
			return img.getSubimage(16*2, 0, 16, 16);
		//Dark blue
		case "J" : 
			return img.getSubimage(16*3, 0, 16, 16);
		//Orange
		case "L" :
			return img.getSubimage(0, 16, 16, 16);
		//Green
		case "S" : 
			return img.getSubimage(16, 16, 16, 16);
		//Red
		case "Z" : 
			return img.getSubimage(16*2, 16, 16, 16);
		//White
		default	:
			return null;
		}
	}
	
	public String getShape() {
		return this.shape;
	}
	
}
