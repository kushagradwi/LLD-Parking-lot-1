package Models.Ticket;

import java.time.Duration;
import java.time.LocalTime;
import java.util.UUID;

import Models.Gate.Gate;
import Models.ParkingSlot.ParkingSlots;
import Models.Vehicle.Vehicle;

public class Ticket {
    String id;
    String liscencePlate;
    ParkingSlots parkingSlot;
    public ParkingSlots getParkingSlot() {
        return parkingSlot;
    }
    LocalTime entryTime;
    Vehicle vehicle;
    public LocalTime getEntryTime() {
        return entryTime;
    }
    public void setEntryTime(LocalTime entryTime) {
        this.entryTime = entryTime;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public Ticket( Vehicle vehicle, ParkingSlots parkingSlot) {
        this.id = UUID.randomUUID().toString();
        this.liscencePlate = vehicle.getLiscencePlate();
        this.parkingSlot = parkingSlot;
        this.entryTime = LocalTime.now();
        this.vehicle=vehicle;
    }
    @Override
    public String toString() {
        return "Ticket [id=" + id + ", liscencePlate=" + liscencePlate + ", parkingSlot=" + parkingSlot + ", entryTime="
                + entryTime + ", vehicle=" + vehicle + "]";
    }
    
}
