package Models.ParkingSlot;

import Models.Vehicle.Vehicle;

public abstract class ParkingSlots {
    String id;
    Boolean isOccupied;
    public void setIsOccupied(Boolean isOccupied) {
        this.isOccupied = isOccupied;
    }
    int fare;
    public String getId() {
        return id;
    }
    public Boolean getIsOccupied() {
        return isOccupied;
    }
    public int getFare() {
        return fare;
    }
    public Boolean getParkingSlotStatus(){
        return isOccupied;
    }
    public abstract boolean checkCompatibility(Vehicle vehicle);
    
}
