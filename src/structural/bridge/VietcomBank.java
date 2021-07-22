package structural.bridge;

public class VietcomBank extends Bank {

    public VietcomBank(IAccount account) {
        super(account);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void openAccount() {
        System.out.print("Open your account at VietcomBank is a ");
        account.openAccount();
    }
    
}
