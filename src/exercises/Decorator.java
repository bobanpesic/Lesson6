package exercises;

import java.util.ArrayList;

public class Decorator {

	ArrayList<Ornament> boxOfDecorations = new ArrayList<Ornament>();

	void hang(Ornament ornament) {

		boxOfDecorations.add(ornament);
		System.out.println("Hanging a " + ornament.getColour() + " ornament.");
	}

	public static void main(String[] args) {

		Decorator decoration = new Decorator();
		Ornament ornament = new Ornament("blue"); // purple, red, yellow...

		decoration.hang(ornament);

	}
}
