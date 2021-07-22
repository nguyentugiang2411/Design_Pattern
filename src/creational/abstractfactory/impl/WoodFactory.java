package creational.abstractfactory.impl;

import creational.abstractfactory.chair.IChair;
import creational.abstractfactory.chair.WoodChair;
import creational.abstractfactory.factory.FurnitureAbstractFactory;
import creational.abstractfactory.table.ITable;
import creational.abstractfactory.table.WoodTable;

public class WoodFactory extends FurnitureAbstractFactory {

    @Override
    public IChair createChair() {
        return new WoodChair();
    }

    @Override
    public ITable createTable() {
        return new WoodTable();
    }
    
}
