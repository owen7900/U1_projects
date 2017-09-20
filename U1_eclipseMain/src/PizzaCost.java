import TerminalIO.KeyboardReader;

public class PizzaCost {
	
	
	
	public static void main(String[] args) {
		KeyboardReader kr = new KeyboardReader();
		double toppings, size, cost;
		System.out.print("Enter Toppings");
		toppings = kr.readDouble();
		System.out.print("Enter Size");
		size = kr.readDouble();
		cost = (size *0.5) + (toppings *0.75) + 1.5 + 0.75;
		System.out.println("cost is " + cost);
	}
}
