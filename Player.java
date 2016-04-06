public class Player {
	
	String name;		// the name of the player
	int weightControl;	// used to determine accuracy of weight
	int accuracy;		// used to determine accuracy of line
	int strength;		// maximum throwing power
	int endurance;		// how long it takes until total fatigue
	int fatigue;		// how tired the player is
	int position;		// the players position on the team { 0: None, 1: Lead etc.}

	public Player() {

		this.weightControl = 0;
		this.accuracy = 0;
		this.strength = 0;
		this.name = "NoName";

	}

	public Player( String chosenName ) {

		this.weightControl = 0;
		this.accuracy = 0;
		this.name = chosenName;

	}

	public Player( String chosenName, int startingWeightControl, int startingAccuracy, int startingStrength ) {

		this.weightControl = startingWeightControl;
		this.accuracy = startingAccuracy;
		this.strength = startingStrength;
		this.name = chosenName;

	}

}