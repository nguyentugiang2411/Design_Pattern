package structural.bridge;

public class TPBank extends Bank {

    public TPBank(IAccount account) {
        super(account);
    }

    @Override
    public void openAccount() {
        System.out.print("Open your account at TPBank is a ");
        account.openAccount();
    }
    
}
