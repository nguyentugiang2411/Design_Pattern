package structural.bridge;

public abstract class Bank {
    protected IAccount account;

    public Bank(IAccount account) {
        this.account = account;
    }

    public abstract void openAccount();
}
