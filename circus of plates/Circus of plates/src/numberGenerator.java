public class numberGenerator {

	private static boolean isFirstInstance = false;
	private static numberGenerator firstInstance = null;

	private numberGenerator() {

	}

	public numberGenerator getInstance() {
		if (!isFirstInstance) {
			firstInstance = new numberGenerator();
			isFirstInstance = true;
			return firstInstance;
		} else {

			return firstInstance;
		}
	}

	public int randomPlateColor() {

		return 0;
	}

	public int randomPlateCreationPostion() {

		return 0;

	}

}
