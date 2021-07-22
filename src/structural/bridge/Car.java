package structural.bridge;

public class Car extends Vehicle {

    public Car(IWorkshop workshop) {
        super(workshop);
    }

    @Override
    public void munuFacture() {
        System.out.print("Car ");
        workshop.workShop();
    }
    
}
