package GAME;

import java.awt.Color;

public class PLAYER {
	
	private int size;
	private String color;
	private int x, y;
	
	public PLAYER(int size, Color color, int x, int y) {
		this.size = size;
		this.color = color;
		this.x = x;
		this.y = y;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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
	
	
	
}
