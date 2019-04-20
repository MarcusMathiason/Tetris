import java.util.Random;

public class Tetromino {
	private Random rand = new Random();
	private enum shapes {
			I, O, T, J, L, S, Z
	};
	private String shape;
	
	public Tetromino() {
		shape = shapes.values()[rand.nextInt(shapes.values().length)].toString();
	}
	
	public String getShape() {
		return this.shape;
	}
	
}
