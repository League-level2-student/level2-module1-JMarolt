package GAME;

public class BLOBBY {
	private int size;
	private int x, y;
	private String color;
	
	public BLOBBY(int size, int x, int y, String color) {
		this.color = color;
		this.size = size;
		this.x = x;
		this.y = y;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
