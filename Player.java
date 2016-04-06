public class Player {
	
	String name;
	int weightControl;
	int accuracy;

	public Player() {

		this.weightControl = 0;
		this.accuracy = 0;
		this.name = "NoName";

	}

	public Player( String chosenName ) {

		this.weightControl = 0;
		this.accuracy = 0;
		this.name = chosenName;

	}

}