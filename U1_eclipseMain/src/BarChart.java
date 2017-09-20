import java.awt.Color;

import TerminalIO.KeyboardReader;
import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;

public class BarChart {

	public static void main(String[] args) {
		KeyboardReader k = new KeyboardReader();
		double h1,h2,h3,h4; 
		
		h1 = k.readDouble("Enter bar 1");
		h2 = k.readDouble("Enter bar 2");
		h3 = k.readDouble("Enter bar 3");
		h4 = k.readDouble("Enter bar 4");
		
		SketchPadWindow w = new SketchPadWindow(640, 480);
		Pen p = new StandardPen(w);
		
		p.setWidth(50);
		p.setColor(Color.RED);
		p.up();
		p.move( -220 ,-120 );
		p.setDirection(90);
		p.down();
		p.move(h1);
		p.up();
		p.move( -120 ,-120 );
		p.setDirection(90);
		p.down();
		p.move(h2);
		p.up();
		p.move( -20 ,-120 );
		p.setDirection(90);
		p.down();
		p.move(h3);
		p.up();
		p.move( 80 ,-120 );
		p.setDirection(90);
		p.down();
		p.move(h4);
		
		
		

	}

}
