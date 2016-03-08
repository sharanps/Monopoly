// TODO: Auto-generated Javadoc
/**
 * This class implements the chance tile functionalities As per this games
 * rules, chance has 5 cards to pick and in random of the cards is picked based
 * on the outcome of the cards the player is credited/moved.
 *
 * @author sharan
 */
public class MonopolyChance extends MonopolyTile {

	/**
	 * Instantiates a new monopoly chance.
	 *
	 * @param tile_name the tile_name
	 * @param tile_value the tile_value
	 * @param tile_location the tile_location
	 */
	public MonopolyChance(String tile_name, int tile_value, int tile_location) {
		super(tile_name, tile_value, tile_location);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new monopoly chance.
	 */
	public MonopolyChance() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Tile play method definition (abstract method) for the Chance location on
	 * board.
	 *
	 * @param p the p
	 */
	public void tilePlay(MonopolyPlayer p) {
		// TODO Auto-generated method stub
		int cardChoice = 0;
		cardChoice = (int) (Math.random() * 5 + 1);

		System.out.println("Player Landed on " + this.getTile_name());
		switch (cardChoice) {
		case 1:
			System.out.println("Oops! Go directly to Jail, do not collect 200 credits.");
			p.setPlayerLocation(11);
			break;

		case 2:
			System.out.println("Yaaah! you get dividend of 50 credits from the bank");
			p.addPlayerCredit(50);
			break;

		case 3:
			System.out.println("Oops! Go back 3 spaces");
			p.substractLocation(3);
			break;

		case 4:
			System.out.println("Congrats! You have won a crossword competition. Collect 10 credits.");
			p.addPlayerCredit(10);
			break;

		case 5:
			System.out.println("Congrats! You have been elected Chairman of the Board. Collect 100 credits");
			p.addPlayerCredit(100);
			break;

		default:
			System.out.println("Something is wrong! Try again");

		}

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MonopolyChance [getTile_name()=" + getTile_name() + ", getTile_value()=" + getTile_value()
				+ ", getTile_location()=" + getTile_location() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}

}
