import javax.swing.JLabel;

public class Cell extends JLabel{
	private static final long serialVersionUID = 1L;
	private boolean empty;
	private int x, y;
	private final int DEFAULT_X = 5;
	private final int DEFAULT_Y = 0;

	public Cell() {
		this.x = DEFAULT_X;
		this.y = DEFAULT_Y;
	}

	public void setXPos(int x) {
		this.x = x;
	}

	public void setYPos(int y) {
		this.y = y;
	}

	public int getXPos() {
		return this.x;
	}

	public int getYPos() {
		return this.y;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}

	public boolean isEmpty() {
		return this.empty;
	}

}
