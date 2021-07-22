package structural.adapter;

public class AdapterPhone implements IPhoneTarget {

    CheckNumberAdaptee checkNumberAdaptee = new CheckNumberAdaptee();

    public AdapterPhone() {

    }

    @Override
    public boolean checkPhoneNumber(String input) {
        if (!checkNumberAdaptee.checkNumber(input)) {
            return false;
        }

        if (input.length() > 11 || input.length() < 10) {
            return false;
        }
        return true;
    }

    @Override
    public boolean checkName(String input) {
        if (!checkNumberAdaptee.checkCharactor(input)) {
            return false;
        }

        if (input.length() > 25) {
            return false;
        }

        return true;
    }
    
}
