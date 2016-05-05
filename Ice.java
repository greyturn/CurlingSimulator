/*

	This object acts as the 1ft x 1ft square of ice represented in IceSheet	

*/

public class Ice {
	
	int pebble;
	int hardness;
	boolean debris;

	public Ice() {

		this.pebble = 0;
		this.hardness = 0;
		this.debris = false;

	}

	public Ice( int initialPebble, int initialHardness, boolean initialDebris ) {

		this.pebble = initialPebble;
		this.hardness = initialHardness;
		this.debris = initialDebris;

	}
	
}