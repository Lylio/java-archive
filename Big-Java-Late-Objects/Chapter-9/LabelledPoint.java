
public class LabelledPoint {
	
	private int x;
	private int y;
	private String label;
	
	public LabelledPoint(int x, int y, String label) {
		setX(x);
		setY(y);
		setLabel(label);
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
	
	public String toString() {
		return "x: " + getX() + "\ny: " + getY() + "\nlabel: " + getLabel();
	}
}
