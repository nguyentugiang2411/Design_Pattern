package creational.factory;

public class BankFactory {
    public BankFactory() {}

    public static final IBank getBank(BankType bankType) {
        switch (bankType) {
            case TPBANK:
                return new TPBank();
            case SACOMBANK:
                return new SacomBank();
            case VIETTINBANK:
                return new ViettinBank();
            default:
                throw new RuntimeException("cause");
        }
    }
}
