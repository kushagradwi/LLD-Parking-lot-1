package Models;

import java.util.*;

import Models.Gate.Gate;
import Models.ParkingSlot.ParkingSlots;
import Models.Vehicle.Vehicle;

class Parking{
    List <ParkingSlots> parkingSlots;
    List <Gate> gates;

    public Parking(List<ParkingSlots> parkingSlots, List <Gate> gates) {
        this.parkingSlots = parkingSlots;
        this.gates=gates;
    }
    public ParkingSlots findNearestParkingSlot(Vehicle vehicle){
        int l=parkingSlots.size();
        for(int i=0;i<l;i++){
            ParkingSlots temp=parkingSlots.get(i);
            if(!temp.getParkingSlotStatus() && temp.checkCompatibility(vehicle)) return temp;
        }
        System.out.println("No available Parking slot for this type.");
        return null;
    }

}