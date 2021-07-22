package creational.singleton;

public class StaticBlockSingleton extends BaseSingleton {
    private static final StaticBlockSingleton INSTANCE;

	private StaticBlockSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	static {
		try {
			INSTANCE = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in create");
			// TODO: handle exception
		}
	}
	
	public static StaticBlockSingleton getInstance() {
		return INSTANCE;
	}
}
