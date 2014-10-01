import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class view extends JFrame {
	Graphics g;
	Canvas drawArea;
	view(){
		drawArea = new Canvas();
		drawArea.setSize(300, 300);
		drawArea.setBackground(Color.white);
		drawArea.setVisible(true);
		add(drawArea);
		g = drawArea.getGraphics();
		
	}
	
	
}
