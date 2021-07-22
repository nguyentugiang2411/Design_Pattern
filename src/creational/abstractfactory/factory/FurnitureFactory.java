package creational.abstractfactory.factory;

import creational.abstractfactory.impl.FlasticFactory;
import creational.abstractfactory.impl.WoodFactory;
import creational.abstractfactory.type.MaterialType;

public class FurnitureFactory {
    public FurnitureFactory() {}

    public static FurnitureAbstractFactory getFactory(MaterialType materialType) {
        switch (materialType) {
            case FLASTIC:
                return new FlasticFactory();
            case WOOD:
                return new WoodFactory();
            default:
                throw new RuntimeException("RuntimeException");
        }
    }
}
