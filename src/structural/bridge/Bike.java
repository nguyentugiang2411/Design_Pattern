package structural.bridge;

public class Bike extends Vehicle {

    public Bike(IWorkshop workshop) {
        super(workshop);
    }

    @Override
    public void munuFacture() {
        System.out.print("Bike ");
        workshop.workShop();
    }
    
}
