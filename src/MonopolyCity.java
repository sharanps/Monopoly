// TODO: Auto-generated Javadoc
/**
 * This class is to implement the tile property of the game board.
 *
 * @author sharan
 */
public class MonopolyCity extends MonopolyTile {

	/**
	 * Instantiates a new monopoly city.
	 *
	 * @param tile_name the tile_name
	 * @param tile_value the tile_value
	 * @param tile_location the tile_location
	 */
	public MonopolyCity(String tile_name, int tile_value, int tile_location) {
		super(tile_name, tile_value, tile_location);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new monopoly city.
	 */
	public MonopolyCity() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Tile play method definition (abstract method) for the City place on board.
	 *
	 * @param p the p
	 */
	public void tilePlay(MonopolyPlayer p) {
		// TODO Auto-generated method stub
		if (p.getPlayerLocation() == 31) {
			System.out.println("Go directly to Jail . Do not pass Go , do not collect 200 credits.");
			p.setPlayerLocation(11);
		}

		else {
			System.out.println("Player Landed on " + this.getTile_name());
			p.addPlayerCredit(this.getTile_value());
			System.out.println(this.getTile_name() + " awards " + this.getTile_value() + " credits.");
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MonopolyCity [getTile_name()=" + getTile_name() + ", getTile_value()=" + getTile_value()
				+ ", getTile_location()=" + getTile_location() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}

}
