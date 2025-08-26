package Models.ParkingSlot;

import Models.Vehicle.Vehicle;

public class HeavyParkingSlot extends ParkingSlots{
    HeavyParkingSlot(String id){
        this.id=id;
        this.fare=500;
        this.isOccupied=false;
    }

    @Override
    public boolean checkCompatibility(Vehicle vehicle) {
        if(vehicle.getWeight()>=2000) return true;
        return false;
    }
    
}
