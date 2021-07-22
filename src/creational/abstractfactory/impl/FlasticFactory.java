package creational.abstractfactory.impl;

import creational.abstractfactory.chair.IChair;
import creational.abstractfactory.chair.PlasticChair;
import creational.abstractfactory.factory.FurnitureAbstractFactory;
import creational.abstractfactory.table.ITable;
import creational.abstractfactory.table.PlasticTable;

public class FlasticFactory extends FurnitureAbstractFactory {

    @Override
    public IChair createChair() {
        return new PlasticChair();
    }

    @Override
    public ITable createTable() {
        return new PlasticTable();
    }
    
}
