package structural.adapter;

public class TranslatorAdapter implements IVietnameseTarget {

    private JapaneseAdaptee adaptee;

    public TranslatorAdapter(JapaneseAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void send(String words) {
        System.out.println("Reading Words ...");
        System.out.println(words);
        String vietnameseWords = this.translate(words);
        System.out.println("Sending Words ...");
        adaptee.receive(vietnameseWords);
    }

    public String translate(String words) {
        System.out.println("Translated!");
        return "こんにちは";
    }
}
