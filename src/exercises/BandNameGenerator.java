package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* 
 * Make 2 ArrayLists; 
 *      1 full of adjectives (e.g. slimy, blind)
 *      1 full of plural nouns (e.g. pants, bones)
 *      
 * When the program is run, one word is randomly selected from each list to generate a band name.
*/
public class BandNameGenerator {

	public static void main(String[] args) {

		List<String> adjectives = new ArrayList<>();

		adjectives.add("Crazy");
		adjectives.add("Loud");
		adjectives.add("Smeling");

		List<String> nouns = new ArrayList<>();

		nouns.add("dogs!");
		nouns.add("Wizards!");
		nouns.add("duck!");

		BandNameGenerator bandName = new BandNameGenerator();

		System.out.println("My band is called: " + (bandName.getRandomElement(adjectives)) + " "
				+ (bandName.getRandomElement(nouns)));

	}

	public String getRandomElement(List<String> adjectives)

	{

		Random r = new Random();
		return adjectives.get(r.nextInt(adjectives.size()));

	}

	public String getRandomElement1(List<String> nouns)

	{

		Random r1 = new Random();
		return nouns.get(r1.nextInt(nouns.size()));

	}
}
