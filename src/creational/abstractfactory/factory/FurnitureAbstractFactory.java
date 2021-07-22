package creational.abstractfactory.factory;

import creational.abstractfactory.chair.IChair;
import creational.abstractfactory.table.ITable;

public abstract class FurnitureAbstractFactory {
    public abstract IChair createChair();
    public abstract ITable createTable();
}
