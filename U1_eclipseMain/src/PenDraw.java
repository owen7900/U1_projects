import TurtleGraphics.*;
import BreezySwing.*;
public class PenDraw {

	public static void main(String[] args) {
		Pen p1,p2,p3;
		
		p1 = new StandardPen();
		p1.setWidth(5);
		p1.move(50);
		p1.turn(90);
		p1.move(40);
		p1.turn(90);
		p1.move(50);
		p1.turn(90);
		p1.move(40);
		p2 = new WigglePen(new SketchPadWindow(500, 500));
		p2.turn(-90);
		p2.move(100);
		p2.turn(-90);
		p2.move(100);
		p2.turn(90);
		p2.move(100);
		p2.turn(-90);
		p2.move(100);	
		p2.home();
		p2.move(100);
		p2.move(-100,-100);

	}

}
