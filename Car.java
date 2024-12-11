// Tyler Kehoe

public class Car extends Vehicle {
    private double gasMileage; // in gallons
    private int numberOfPassengers;

    // Default Constructor
    public Car() {
        super();
        this.gasMileage = 0.0;
        this.numberOfPassengers = 0;
    }

    // Parameterized Constructor
    public Car(String manufacturerName, int numberOfCylinders, String ownerName, double gasMileage, int numberOfPassengers) {
        super(manufacturerName, numberOfCylinders, ownerName);
        if (gasMileage < 0 || numberOfPassengers < 0) {
            throw new IllegalArgumentException("Gas mileage and number of passengers must be non-negative.");
        }
        this.gasMileage = gasMileage;
        this.numberOfPassengers = numberOfPassengers;
    }

    // Accessors
    public double getGasMileage() {
        return gasMileage;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    // Mutators
    public void setGasMileage(double gasMileage) {
        if (gasMileage < 0) {
            throw new IllegalArgumentException("Gas mileage must be non-negative.");
        }
        this.gasMileage = gasMileage;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        if (numberOfPassengers < 0) {
            throw new IllegalArgumentException("Number of passengers must be non-negative.");
        }
        this.numberOfPassengers = numberOfPassengers;
    }

    // Methods
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Car car = (Car) obj;
        return Double.compare(car.gasMileage, gasMileage) == 0 &&
                numberOfPassengers == car.numberOfPassengers;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nGas Mileage: " + gasMileage + " gallons" +
                "\nNumber of Passengers: " + numberOfPassengers;
    }
}
