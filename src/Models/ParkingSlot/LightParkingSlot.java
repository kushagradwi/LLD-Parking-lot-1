package Models.ParkingSlot;

import Models.Vehicle.Vehicle;

public class LightParkingSlot extends ParkingSlots {
    LightParkingSlot(String id){
        this.id=id;
        this.fare=50;
        this.isOccupied=false;
    }
    @Override
    public boolean checkCompatibility(Vehicle vehicle) {
        int weight=vehicle.getWeight();
        if(weight<200) return true;
        return false;
    }
}
