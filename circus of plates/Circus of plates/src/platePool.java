public class platePool {

	private static platePool firstInstance = null;
	private static boolean isFirstInstance = false;
	private static int poolSize = 10; // by default

	private platePool() {

	}

	public static platePool getInstance() {

		if (!isFirstInstance) {
			firstInstance = new platePool();
			isFirstInstance = true;
			return firstInstance;
		} else {

			return firstInstance;
		}

	}

	public void setMaxPoolSize(int n) {
		poolSize = n;

	}

	public void getReusablePlate() {

	}

	public void releaseReusablePlate() {

	}

}
