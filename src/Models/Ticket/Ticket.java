package Models.Ticket;

import java.time.LocalTime;
import java.util.UUID;

import Models.Gate.Gate;
import Models.ParkingSlot.ParkingSlots;
import Models.Vehicle.Vehicle;

public class Ticket {
    String id;
    String liscencePlate;
    String parkingSlotID;
    String gateID;
    LocalTime entryTime;
    public Ticket( Vehicle vehicle, ParkingSlots parkingSlot, Gate gate) {
        this.id = UUID.randomUUID().toString();
        this.liscencePlate = vehicle.getLiscencePlate();
        this.gateID=gate.getId();
        this.parkingSlotID = parkingSlot.getId();
        this.entryTime = LocalTime.now();;
    }
}
