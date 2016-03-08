// TODO: Auto-generated Javadoc
/**
 * Abstract class to all the tiles in the board game.
 *
 * @author sharan
 */
public abstract class MonopolyTile {

	/** The tile_name. */
	private String tile_name;
	
	/** The tile_value. */
	private int tile_value;
	
	/** The tile_location. */
	private int tile_location;

	/**
	 * Instantiates a new monopoly tile.
	 *
	 * @param tile_name the tile_name
	 * @param tile_value the tile_value
	 * @param tile_location the tile_location
	 */
	public MonopolyTile(String tile_name, int tile_value, int tile_location) {
		this.tile_name = tile_name;
		this.tile_value = tile_value;
		this.tile_location = tile_location;

	}

	/**
	 * Instantiates a new monopoly tile.
	 */
	public MonopolyTile() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Gets the tile_name.
	 *
	 * @return the tile_name
	 */
	public String getTile_name() {
		return tile_name;
	}

	/**
	 * Sets the tile_name.
	 *
	 * @param tile_name the new tile_name
	 */
	public void setTile_name(String tile_name) {
		this.tile_name = tile_name;
	}

	/**
	 * Gets the tile_value.
	 *
	 * @return the tile_value
	 */
	public int getTile_value() {
		return tile_value;
	}

	/**
	 * Sets the tile_value.
	 *
	 * @param tile_value the new tile_value
	 */
	public void setTile_value(int tile_value) {
		this.tile_value = tile_value;
	}

	/**
	 * Gets the tile_location.
	 *
	 * @return the tile_location
	 */
	public int getTile_location() {
		return tile_location;
	}

	/**
	 * Sets the tile_location.
	 *
	 * @param tile_location the new tile_location
	 */
	public void setTile_location(int tile_location) {
		this.tile_location = tile_location;
	}

	/**
	 * This is an abstract method which will be extended across all classes.
	 *
	 * @param p the p
	 */
	abstract public void tilePlay(MonopolyPlayer p);

}
