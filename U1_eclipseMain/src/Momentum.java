import TerminalIO.*;
public class Momentum {

	public static void main(String[] args) {
		KeyboardReader kr = new KeyboardReader();
		double mass, velocity, momentum;
		System.out.print("Enter Mass");
		mass = kr.readDouble();
		System.out.print("Enter Velocity");
		velocity = kr.readDouble();
		momentum = mass * velocity;
		System.out.println("Momentum is " + momentum);
	}

}
