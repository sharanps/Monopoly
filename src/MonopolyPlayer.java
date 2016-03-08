// TODO: Auto-generated Javadoc
/**
 * Player class to hold the player property like the location, credit, etc.
 * @author sharan
 *
 */
public class MonopolyPlayer {

	/** The player name. */
	private String playerName;
	
	/** The player credit. */
	private int playerCredit;
	
	/** The player location. */
	private int playerLocation;
	
	/** The dice rolled. */
	private int diceRolled;
	
	/** The count of rail road positions. */
	private int countOfRailRoadPositions;
	
	/** The game over. */
	private boolean gameOver;

	/**
	 * Checks if is game over.
	 *
	 * @return true, if is game over
	 */
	public boolean isGameOver() {
		return gameOver;
	}

	/**
	 * Sets the game over.
	 *
	 * @param gameOver the new game over
	 */
	public void setGameOver(boolean gameOver) {
		this.gameOver = gameOver;
	}

	/**
	 * Gets the count of rail road positions.
	 *
	 * @return the count of rail road positions
	 */
	public int getCountOfRailRoadPositions() {
		return countOfRailRoadPositions;
	}

	/**
	 * Sets the count of rail road positions.
	 *
	 * @param countOfRailRoadPositions the new count of rail road positions
	 */
	public void setCountOfRailRoadPositions(int countOfRailRoadPositions) {
		this.countOfRailRoadPositions = countOfRailRoadPositions;
	}

	/**
	 * Gets the dice rolled.
	 *
	 * @return the dice rolled
	 */
	public int getDiceRolled() {
		return diceRolled;
	}

	/**
	 * Sets the dice rolled.
	 *
	 * @param diceRolled the new dice rolled
	 */
	public void setDiceRolled(int diceRolled) {
		this.diceRolled = diceRolled;
	}

	/**
	 * Instantiates a new monopoly player.
	 *
	 * @param playerName the player name
	 * @param playerCredit the player credit
	 * @param playerLocation the player location
	 */
	public MonopolyPlayer(String playerName, int playerCredit,
			int playerLocation) {
		super();
		this.playerName = playerName;
		this.playerCredit = playerCredit;
		this.playerLocation = playerLocation;
		this.countOfRailRoadPositions = 0;
	}

	/**
	 * Gets the player name.
	 *
	 * @return the player name
	 */
	public String getPlayerName() {
		return playerName;
	}

	/**
	 * Sets the player name.
	 *
	 * @param playerName the new player name
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	/**
	 * Gets the player credit.
	 *
	 * @return the player credit
	 */
	public int getPlayerCredit() {
		return playerCredit;
	}

	/**
	 * Sets the player credit.
	 *
	 * @param playerCredit the new player credit
	 */
	public void setPlayerCredit(int playerCredit) {
		this.playerCredit = playerCredit;
	}

	/**
	 * Gets the player location.
	 *
	 * @return the player location
	 */
	public int getPlayerLocation() {
		return playerLocation;
	}

	/**
	 * Sets the player location.
	 *
	 * @param playerLocation the new player location
	 */
	public void setPlayerLocation(int playerLocation) {
		this.playerLocation = playerLocation;
	}

	/**
	 * Instantiates a new monopoly player.
	 */
	public MonopolyPlayer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Adds the player credit.
	 *
	 * @param credit the credit
	 */
	public void addPlayerCredit(int credit) {
		this.playerCredit += credit;
	}

	/**
	 * Adds the location.
	 *
	 * @param location the location
	 */
	public void addLocation(int location) {
		this.playerLocation += location;
	}

	/**
	 * Substract location.
	 *
	 * @param location the location
	 */
	public void substractLocation(int location) {
		this.playerLocation -= location;

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MonopolyPlayer [playerName=" + playerName + ", playerCredit="
				+ playerCredit + ", playerLocation=" + playerLocation
				+ ", diceRolled=" + diceRolled + "]";
	}

}
