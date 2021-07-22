package structural.adapter;

public class CheckNumberAdaptee {
    
    public boolean checkNumber(String input) {
        String regex = "[0-9]+";
        return regex.matches(input);
    }

    public boolean checkCharactor(String input) {
        String regex = "[a-zA-Z0-9_]";
        return regex.matches(input);
    }
}
