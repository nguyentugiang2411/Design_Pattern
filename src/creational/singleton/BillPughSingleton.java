package creational.singleton;

public class BillPughSingleton extends BaseSingleton {
    private BillPughSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
	
	private static class SingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();		
	}
}
