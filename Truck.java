// Tyler Kehoe

public class Truck extends Vehicle {
    private double loadCapacity; // in tons
    private double towingCapacity; // in tons

    // Default Constructor
    public Truck() {
        super();
        this.loadCapacity = 0.0;
        this.towingCapacity = 0.0;
    }

    // Parameterized Constructor
    public Truck(String manufacturerName, int numberOfCylinders, String ownerName, double loadCapacity, double towingCapacity) {
        super(manufacturerName, numberOfCylinders, ownerName);
        if (loadCapacity < 0 || towingCapacity < 0) {
            throw new IllegalArgumentException("Load and towing capacity must be non-negative.");
        }
        this.loadCapacity = loadCapacity;
        this.towingCapacity = towingCapacity;
    }

    // Accessors
    public double getLoadCapacity() {
        return loadCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    // Mutators
    public void setLoadCapacity(double loadCapacity) {
        if (loadCapacity < 0) {
            throw new IllegalArgumentException("Load capacity must be non-negative.");
        }
        this.loadCapacity = loadCapacity;
    }

    
    public void setTowingCapacity(double towingCapacity) {
        if (towingCapacity < 0) {
            throw new IllegalArgumentException("Towing capacity must be non-negative.");
        }
        this.towingCapacity = towingCapacity;
    }

    // Methods
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Truck truck = (Truck) obj;
        return Double.compare(truck.loadCapacity, loadCapacity) == 0 &&
                Double.compare(truck.towingCapacity, towingCapacity) == 0;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nLoad Capacity: " + loadCapacity +
                "\nTowing Capacity: " + towingCapacity;
    }
}
