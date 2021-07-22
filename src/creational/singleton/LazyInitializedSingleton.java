package creational.singleton;

public class LazyInitializedSingleton extends BaseSingleton {
    private static LazyInitializedSingleton INSTANCE;
	
	private LazyInitializedSingleton() {
		// TODO Auto-generated constructor stub
	}	
	
	public static LazyInitializedSingleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new LazyInitializedSingleton();
		}
		return INSTANCE;
	}
}
