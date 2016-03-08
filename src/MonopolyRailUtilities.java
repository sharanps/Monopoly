// TODO: Auto-generated Javadoc
/**
 * This class is used as a implementation of the utilities property.
 *
 * @author sharan
 */
public class MonopolyRailUtilities extends MonopolyTile {

	/** The utility multiple. */
	private int utilityMultiple;

	/**
	 * Instantiates a new monopoly rail utilities.
	 */
	public MonopolyRailUtilities() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new monopoly rail utilities.
	 *
	 * @param tile_name the tile_name
	 * @param tile_value the tile_value
	 * @param tile_location the tile_location
	 * @param utility_Multiple the utility_ multiple
	 */
	public MonopolyRailUtilities(String tile_name, int tile_value,
			int tile_location, int utility_Multiple) {
		super(tile_name, tile_value, tile_location);
		this.utilityMultiple = utility_Multiple;
		// TODO Auto-generated constructor stub
	}

	/**
	 * Gets the utility multiple.
	 *
	 * @return the utility multiple
	 */
	public int getUtilityMultiple() {
		return utilityMultiple;
	}

	/**
	 * Sets the utility multiple.
	 *
	 * @param utilityMultiple the new utility multiple
	 */
	public void setUtilityMultiple(int utilityMultiple) {
		this.utilityMultiple = utilityMultiple;
	}

	/**
	 * Tile play method definition (abstract method) for the Railways and
	 * utilities on board.
	 *
	 * @param p the p
	 */
	public void tilePlay(MonopolyPlayer p) {
		// TODO Auto-generated method stub
		int tile_location = this.getTile_location();

		System.out.println("Player Landed on " + this.getTile_name());
		if (tile_location == 6 || tile_location == 16 || tile_location == 26
				|| tile_location == 36) {

			// This increments the counter for the number of railway landings
			int updatedCount = p.getCountOfRailRoadPositions() + 1;
			p.setCountOfRailRoadPositions(updatedCount);

			System.out.println(this.getTile_name() + " awards " + updatedCount
					+ " * " + this.getTile_value() + " - "
					+ this.getTile_value() * updatedCount + " Credits");
			p.addPlayerCredit(this.getTile_value() * updatedCount);
		} else {
			p.addPlayerCredit((p.getDiceRolled() * this.utilityMultiple));
			System.out.println(this.getTile_name() + " awards "
					+ p.getDiceRolled() + " * " + this.utilityMultiple + " - "
					+ (p.getDiceRolled() * this.utilityMultiple));

		}

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MonopolyTileUtilities [utilityMultiple=" + utilityMultiple
				+ ", getTile_name()=" + getTile_name() + ", getTile_value()="
				+ getTile_value() + ", getTile_location()="
				+ getTile_location() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}

}
