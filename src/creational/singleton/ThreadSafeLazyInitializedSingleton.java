package creational.singleton;

public class ThreadSafeLazyInitializedSingleton extends BaseSingleton {
    // Biến volatile trong Java có tác dụng thông báo sự thay đổi giá trị 
	// của biến tới các thread khác nhau nếu biến này đang được sử dụng trong nhiều thread.
	private static volatile ThreadSafeLazyInitializedSingleton instance;

	private ThreadSafeLazyInitializedSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static synchronized ThreadSafeLazyInitializedSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeLazyInitializedSingleton();
		}
		return instance;
	}
}
