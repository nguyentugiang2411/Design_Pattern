package structural.bridge;

public class CheckingAccount implements IAccount {

    @Override
    public void openAccount() {
        System.out.println("Checking Account");
    }
    
}
