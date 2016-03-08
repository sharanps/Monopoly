// TODO: Auto-generated Javadoc
/**
 * Class to implement the Community Chest function
 * Community chest has 5 cards to pick from, based on the card outcome the player 
 * will be moved/credited.
 *
 * @author sharan
 */
public class MonopolyCommunityChest extends MonopolyTile {

	/**
	 * Instantiates a new monopoly community chest.
	 *
	 * @param tile_name the tile_name
	 * @param tile_value the tile_value
	 * @param tile_location the tile_location
	 */
	public MonopolyCommunityChest(String tile_name, int tile_value,
			int tile_location) {
		super(tile_name, tile_value, tile_location);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new monopoly community chest.
	 */
	public MonopolyCommunityChest() {
		// TODO Auto-generated constructor stub

	}

	/**
	 * Tile play method definition (abstract method) for the Community chest
	 * place on board.
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
			System.out
					.println("Congrats! Bank error in your favor. Collect 200 credits");
			p.addPlayerCredit(200);
			break;

		case 2:
			System.out
					.println("Congrats! From sale of stock, you get 50 credits.");
			p.addPlayerCredit(50);
			break;

		case 3:
			System.out
					.println("Oops! Go directly to Jail, do not collect 200 credits.");
			p.setPlayerLocation(11);
			break;

		case 4:
			System.out
					.println("Yaah! Holiday Fund matures. Receive 100 credits.");
			p.addPlayerCredit(100);
			break;

		case 5:
			System.out.println("Yaah! Income tax refund. Collect 20 credits");
			p.addPlayerCredit(20);
			break;

		default:
			System.out.println("Something is wrong in chance");

		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MonopolyCommunityChest [getTile_name()=" + getTile_name()
				+ ", getTile_value()=" + getTile_value()
				+ ", getTile_location()=" + getTile_location()
				+ ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}

}
