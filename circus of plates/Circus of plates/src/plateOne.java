public class plateOne extends shape {

	private plateState currentState;
	private plateState plateIsFree;
	private plateState plateIsWithPlayer;
	private plateState plateIsInPool;
	private plateState plateIsInRailer;

	public plateOne() {
		plateIsFree = new plateFree(this);
		plateIsWithPlayer = new plateWithplayer(this);
		plateIsInRailer = new plateWithplayer(this);
		plateIsInPool = new plateInPool(this);

		currentState = plateIsInPool;

	}

	public void setState(plateState newPlateState) {
		currentState = newPlateState;

	}

	public plateState getCurrentState() {

		return currentState;
	}

	public plateState getPoolState() {
		return plateIsInPool;

	}

	public plateState getFreeState() {
		return plateIsFree;

	}

	public plateState getPlayerState() {
		return plateIsWithPlayer;

	}

	public plateState getRailerState() {
		return plateIsInRailer;

	}

}
