public class plateFactory {
	private static boolean isFirstInstance = false;
	private static plateFactory firstInstance = null;

	private plateFactory() {

	}

	public plateFactory getInstance() {
		if (!isFirstInstance) {
			firstInstance = new plateFactory();
			isFirstInstance = true;
			return firstInstance;
		} else {
			return firstInstance;

		}

	}

	public shape getPlate(int choose) {

		if (choose == 0) {
			return new plateOne();
		} else
			return new plateTwo();

	}

}
