package structural.bridge;

public abstract class Vehicle {
    protected IWorkshop workshop;

    public Vehicle(IWorkshop workshop) {
        this.workshop = workshop;
    }

    abstract public void munuFacture();
}
