package creational.singleton;

public class SingletonService {

    public SingletonService() {}

    public void getEageInitializedSingleton() {
        EageInitializedSingleton.getInstance().getConsole("EageInitializedSingleton");
    }

    public void getLazyInitializedSingleton() {
        LazyInitializedSingleton.getInstance().getConsole("LazyInitializedSingleton");
    }

    public void getBillPughSingleton() {
        BillPughSingleton.getInstance().getConsole("BillPughSingleton");
    }

    public void getStaticBlockSingleton() {
        StaticBlockSingleton.getInstance().getConsole("StaticBlockSingleton");
    }

    public void getThreadSafeLazyInitializedSingleton() {
        ThreadSafeLazyInitializedSingleton.getInstance().getConsole("ThreadSafeLazyInitializedSingleton");
    }
}
