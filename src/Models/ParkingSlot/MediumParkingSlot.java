package Models.ParkingSlot;

import Models.Vehicle.Vehicle;

public class MediumParkingSlot extends ParkingSlots{
    MediumParkingSlot(String id){
        this.id=id;
        this.fare=100;
        this.isOccupied=false;
    }
    public boolean checkCompatibility(Vehicle vehicle) {
        int weight=vehicle.getWeight();
        if(weight<2000 &&weight>=200) return true;
        return false;
    }
}
