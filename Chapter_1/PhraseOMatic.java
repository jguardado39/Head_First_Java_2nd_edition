public class PhraseOMatic {
	public static void main(String[] args) {
		// make three sets of words to choose from. Add your own!
		String[] wordListOne = {"24/7", "multi-Tier", "30,00 foot", "B-to-B", "win-win",
		"front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path",
		"dynamic", "back-end", "I'm too", "hasta", "ninja", "ghost", "Jesus"};

		String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented",
		"centric", "distributed", "clustered", "branded", "outside-the-box", "positioned",
		"networked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative",
		"accelerated", "sucks", "old for", "la vista", "please", "in the", "Christ"};

		String[] wordListThree = {"process", "tipping-point", "solution", "architecture",
		"core competency", "strategy", "mindshare", "portal", "space", "vision", "paradigm",
		"mission", "balls", "this", "baby", "hoe", "shell", "our lord and savior"};

		// find out how many words are in each list
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		// generate three random numbers
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);

		// new build a phrase
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + 
		wordListThree[rand3] + ".";

		//print out the phrase
		System.out.println("What we need is a " + phrase);
	}
}