package creational.singleton;

public class EageInitializedSingleton extends BaseSingleton {

    private static final EageInitializedSingleton INSTANCE = new EageInitializedSingleton();
	
	private EageInitializedSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static EageInitializedSingleton getInstance() {
		return INSTANCE;
	}
}
