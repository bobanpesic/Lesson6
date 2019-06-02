package exercises;

/* 
 * Create a class called Decorator that contains an ArrayList called boxOfDecorations.
 *   1. In the Decorator class, hang all the ornaments in the box.
 *   2. Add a color to the Ornament class so that your program prints Hanging a red ornament, etc.
 */

public class Ornament {

	private String ornamentColour;

	public Ornament(String color) {
		ornamentColour = color;
	}

	public void hang() {
		System.out.println("hanging an ornament");
	}

	public String getColour() {
		// TODO Auto-generated method stub
		return ornamentColour;
	}

}
