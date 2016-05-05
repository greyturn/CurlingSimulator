public class Team {
	
	String name;
	Player lead;
	Player second;
	Player third;
	Player skip;
	Player alternate;

	public Team() {

		this.name = "NoName";

	}

	public Team( String chosenTeamName, Player newLead, Player newSecond, Player newThird, Player newSkip, Player newAlternate ) {

		this.name = chosenTeamName;
		this.lead = newLead;
		this.second = newSecond;
		this.third = newThird;
		this.skip = newSkip;
		this.alternate = newAlternate;

	}

}