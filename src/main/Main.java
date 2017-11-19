package main;

import behavioral.patterns.*;

public class Main {

	public static void main(String[] args) {
		Carte Iona = new Carte();
		visitorOne Ana = new visitorOne();
		visitorTwo Bogdan = new visitorTwo();
		Iona.printOut();
		Iona.accept(Ana);
		Iona.printOut();
	}

}
