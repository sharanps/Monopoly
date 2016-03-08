import java.util.ArrayList;
import java.util.HashMap;

// TODO: Auto-generated Javadoc
/**
 * Driver Class for the game
 * HashMap is used to hold the board structure.
 *
 * @author sharan
 */
public class MonopolyGame {

	/** The monopoly board. */
	static HashMap<Integer, MonopolyTile> monopolyBoard = new HashMap<>();
	
	/** The number of players left. */
	static int numberOfPlayersLeft = 0;

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws Exception the exception
	 */
	public static void main(String[] args) throws Exception {

		// Set up tiles of the board
		setUpTilesOfBoard();

		// Object created for rolling dice
		PairOfDice dice = new PairOfDice();

		/*
		 * Using the scanner class if we can set the number of player it will
		 * work for multiple player, but it was not implemented currently in
		 * this version. As this is generic solution it can be implemented with
		 * multiple player with small changes
		 */

		int numberOfPlayers = 1;
		numberOfPlayersLeft = numberOfPlayers;
		ArrayList<MonopolyPlayer> players = new ArrayList<MonopolyPlayer>();
		players = createPlayers(numberOfPlayers);
		int currentPlayer = 0;

		while (currentPlayer <= numberOfPlayers) {

			MonopolyPlayer player = (MonopolyPlayer) players.get(currentPlayer);

			if (!player.isGameOver()) {
				playTurn(player, dice);
			}
			if (numberOfPlayersLeft > 0) {
				if (currentPlayer == numberOfPlayers - 1)
					currentPlayer = 0;
				else
					currentPlayer = currentPlayer + 1;
			} else
				break;
		}

	}

	/**
	 * Method to start playing the bonus round.
	 *
	 * @param player the player
	 * @param dice the dice
	 * @throws Exception the exception
	 */
	public static void playTurn(MonopolyPlayer player, PairOfDice dice) throws Exception {
		try {
			MonopolyTile tile = null;
			int rolled_dice = 0, current_tile = 0;
			dice.roll();
			rolled_dice = dice.getTotal();
			System.out.println(player.getPlayerName() + " rolled " + dice.getDie1() + " and " + dice.getDie2() + " = "
					+ dice.getTotal());
			player.setDiceRolled(rolled_dice);
			player.addLocation(rolled_dice);
			current_tile = player.getPlayerLocation();
			if (current_tile > 40) {
				System.out.println("Player passes Go and is awarded 200 credits " + player.getPlayerName() + " wins!");
				player.addPlayerCredit(200);
				System.out.println("Total Credits Won : " + player.getPlayerCredit());
				player.setGameOver(true);
				numberOfPlayersLeft--;
				return;
				// return true;
			}
			tile = monopolyBoard.get(current_tile);

			tile.tilePlay(player);
			// return false;
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * Method to set number of player and initial values of each player.
	 *
	 * @param numberOfPlayers the number of players
	 * @return the array list
	 */
	private static ArrayList<MonopolyPlayer> createPlayers(int numberOfPlayers) {
		// TODO Auto-generated method stub
		ArrayList<MonopolyPlayer> players = new ArrayList<MonopolyPlayer>();
		for (int i = 1; i <= numberOfPlayers; i++) {
			MonopolyPlayer p = new MonopolyPlayer("Player", 0, 1);
			players.add(p);
		}
		return players;
	}

	/**
	 * Method to setup the board tiles as per the game. It creates a set of
	 * 40 objects corresponding to 40 tiles on the board game
	 */
	static void setUpTilesOfBoard() {

		MonopolyCity go = new MonopolyCity("GO", 200, 1);
		MonopolyCity medAve = new MonopolyCity("Mditerranean Avenue", 60, 2);
		MonopolyCommunityChest comChest = new MonopolyCommunityChest("Community Chest", 0, 3);
		MonopolyCity balticAve = new MonopolyCity("Baltic Avenue", 60, 4);
		MonopolyCity incTax = new MonopolyCity("Income Tax", 200, 5);
		MonopolyRailUtilities readingRail = new MonopolyRailUtilities("Reading Rail Road", 200, 6, 0);
		MonopolyCity orientalAve = new MonopolyCity("Oriental Avenue", 100, 7);
		MonopolyChance chance1 = new MonopolyChance("Chance", 0, 8);
		MonopolyCity vermontAve = new MonopolyCity("Vermont Avenue", 100, 9);
		MonopolyCity connecticutAve = new MonopolyCity("Connecticut Avenue", 120, 10);
		MonopolyCity jail1 = new MonopolyCity("Just Visiting", 0, 11);
		MonopolyCity stCharlesPlace = new MonopolyCity("St. Charles Place", 140, 12);
		MonopolyRailUtilities besCom = new MonopolyRailUtilities("Electric Company", 0, 13, 5);
		MonopolyCity stateAve = new MonopolyCity("States Avenue ", 140, 14);
		MonopolyCity virginiaAve = new MonopolyCity("Virginia Avenue", 160, 15);
		MonopolyRailUtilities pensilvaniaRail = new MonopolyRailUtilities("Pensilvania Rail Road", 200, 16, 0);
		MonopolyCity stJamesPlace = new MonopolyCity("St. James Place", 180, 17);
		MonopolyCommunityChest comChest2 = new MonopolyCommunityChest("Community Chest", 0, 18);
		MonopolyCity tennesseeAve = new MonopolyCity("Tennessee Avenue", 180, 19);
		MonopolyCity newYorkAve = new MonopolyCity("New York Avenue", 200, 20);
		MonopolyCity freePark = new MonopolyCity("Free Parking", 0, 21);
		MonopolyCity kentuckyAve = new MonopolyCity("Kentucky Avenue", 220, 22);
		MonopolyChance chance2 = new MonopolyChance("Chance", 0, 23);
		MonopolyCity indianaAve = new MonopolyCity("Indiana Avenue", 220, 24);
		MonopolyCity illioisAve = new MonopolyCity("Illinois Avenue", 240, 25);
		MonopolyRailUtilities boRail = new MonopolyRailUtilities("B&O Railroad", 200, 26, 0);
		MonopolyCity atlanticAve = new MonopolyCity("Atlantic Avenue", 260, 27);
		MonopolyCity ventnorAve = new MonopolyCity("Ventnor Avenue", 260, 28);
		MonopolyRailUtilities water = new MonopolyRailUtilities("Water Work", 0, 29, 10);
		MonopolyCity marvinGardens = new MonopolyCity("Marvin Gardens", 280, 30);
		MonopolyCity jail3 = new MonopolyCity("Go to Jail", 0, 31);
		MonopolyCity pacificAve = new MonopolyCity("Pacific Avenue", 300, 32);
		MonopolyCity northCarolinaAve = new MonopolyCity("North Carolina Avenue", 300, 33);
		MonopolyCommunityChest comchest3 = new MonopolyCommunityChest("Community Chest", 0, 34);
		MonopolyCity pensylvaniaAve = new MonopolyCity("Pennsylvania Avenue", 320, 35);
		MonopolyRailUtilities shortlineRail = new MonopolyRailUtilities("Short line Railroad", 200, 36, 0);
		MonopolyChance chance3 = new MonopolyChance("Chance", 0, 37);
		MonopolyCity parkPlace = new MonopolyCity("Park Place", 350, 38);
		MonopolyCity luxoryTax = new MonopolyCity("Luxory Tax", 100, 39);
		MonopolyCity broadwalk = new MonopolyCity("Boardwalk", 400, 40);

		monopolyBoard.put(go.getTile_location(), go);
		monopolyBoard.put(medAve.getTile_location(), medAve);
		monopolyBoard.put(comChest.getTile_location(), comChest);
		monopolyBoard.put(balticAve.getTile_location(), balticAve);
		monopolyBoard.put(incTax.getTile_location(), incTax);
		monopolyBoard.put(readingRail.getTile_location(), readingRail);
		monopolyBoard.put(orientalAve.getTile_location(), orientalAve);
		monopolyBoard.put(chance1.getTile_location(), chance1);
		monopolyBoard.put(vermontAve.getTile_location(), vermontAve);
		monopolyBoard.put(connecticutAve.getTile_location(), connecticutAve);
		monopolyBoard.put(jail1.getTile_location(), jail1);
		monopolyBoard.put(stCharlesPlace.getTile_location(), stCharlesPlace);
		monopolyBoard.put(besCom.getTile_location(), besCom);
		monopolyBoard.put(stateAve.getTile_location(), stateAve);
		monopolyBoard.put(virginiaAve.getTile_location(), virginiaAve);
		monopolyBoard.put(pensilvaniaRail.getTile_location(), pensilvaniaRail);
		monopolyBoard.put(stJamesPlace.getTile_location(), stJamesPlace);
		monopolyBoard.put(comChest2.getTile_location(), comChest2);
		monopolyBoard.put(tennesseeAve.getTile_location(), tennesseeAve);
		monopolyBoard.put(newYorkAve.getTile_location(), newYorkAve);
		monopolyBoard.put(freePark.getTile_location(), freePark);
		monopolyBoard.put(kentuckyAve.getTile_location(), kentuckyAve);
		monopolyBoard.put(chance2.getTile_location(), chance2);
		monopolyBoard.put(indianaAve.getTile_location(), indianaAve);
		monopolyBoard.put(illioisAve.getTile_location(), illioisAve);
		monopolyBoard.put(boRail.getTile_location(), boRail);
		monopolyBoard.put(atlanticAve.getTile_location(), atlanticAve);
		monopolyBoard.put(ventnorAve.getTile_location(), ventnorAve);
		monopolyBoard.put(water.getTile_location(), water);
		monopolyBoard.put(marvinGardens.getTile_location(), marvinGardens);
		monopolyBoard.put(jail3.getTile_location(), jail3);
		monopolyBoard.put(pacificAve.getTile_location(), pacificAve);
		monopolyBoard.put(northCarolinaAve.getTile_location(), northCarolinaAve);
		monopolyBoard.put(comchest3.getTile_location(), comchest3);
		monopolyBoard.put(pensylvaniaAve.getTile_location(), pensylvaniaAve);
		monopolyBoard.put(shortlineRail.getTile_location(), shortlineRail);
		monopolyBoard.put(chance3.getTile_location(), chance3);
		monopolyBoard.put(parkPlace.getTile_location(), parkPlace);
		monopolyBoard.put(luxoryTax.getTile_location(), luxoryTax);
		monopolyBoard.put(broadwalk.getTile_location(), broadwalk);
	}

}
