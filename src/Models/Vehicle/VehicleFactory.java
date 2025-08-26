package Models.Vehicle;

public class VehicleFactory {
    public static Vehicle createVehicle(VehicleType type, String liscencePlateNumber, int weight) {
        switch (type) {
            case CAR:
                return new Car(liscencePlateNumber,weight);
            case BIKE:
                return new Bike(liscencePlateNumber,weight);
            case TRUCK:
                return new Truck(liscencePlateNumber,weight);
            default:
                throw new IllegalArgumentException("Unknown VEHICLE type: " + type);
        }
    }
}
