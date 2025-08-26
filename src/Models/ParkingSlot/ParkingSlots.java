package Models.ParkingSlot;


import Models.Vehicle.Vehicle;

public abstract class ParkingSlots {
    String id;
    Boolean isOccupied;
    int fare;
    public String getId() {
        return id;
    }
    public int getFare() {
        return fare;
    }
    public Boolean getParkingSlotStatus(){
        return isOccupied;
    }
    public abstract boolean checkCompatibility(Vehicle vehicle);
    
}
