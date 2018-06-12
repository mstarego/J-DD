import java.awt.Color;

public class Village extends Space {
	public Village(int x, int y, int w, int h) {
		super(x, y, w, h);
		setColor(Color.GREEN);
	}
	public Color getColor() {
		return color;
	}
}
