package GAME;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Driver implements KeyListener{

	public static void main(String[] agrs) {
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		JLabel l = new JLabel();
		int psize = 100;
		int size = 100;
		int x = 500;
		int y = 500;
		Color rgb = new Color(255, 0, 0);
		PLAYER p1 = new PLAYER(psize, x, y, rgb);
		
		
		
	}
	
	public void draw(Graphics g) {
		g.drawOval(500, 500, psize, psize);
	}

	public void keyTyped(KeyEvent e) {
		
	}

	public void keyPressed(KeyEvent e) {
		
	}

	public void keyReleased(KeyEvent e) {
		
	}
	
	
	
}
