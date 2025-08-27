import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import Models.ParkingSlot.ParkingSlotFactory;
import Models.ParkingSlot.ParkingSlots;
import Models.ParkingSlot.SlotType;
import Models.Vehicle.Vehicle;
import Models.Vehicle.VehicleFactory;
import Models.Vehicle.VehicleType;

public class App {
    public static void main(String[] args) throws Exception {
        ParkingSlotFactory parkingSlotFactory=new ParkingSlotFactory();
        List<ParkingSlots> parkingSlots=new ArrayList<>();
        for(int i=0;i<3;i++){
            parkingSlots.add(parkingSlotFactory.createParkingSlot(SlotType.LIGHT, UUID.randomUUID().toString()));
            parkingSlots.add(parkingSlotFactory.createParkingSlot(SlotType.HEAVY, UUID.randomUUID().toString()));
            parkingSlots.add(parkingSlotFactory.createParkingSlot(SlotType.MEDIUM, UUID.randomUUID().toString()));
        }
        Parking parking=new Parking(parkingSlots);

        VehicleFactory vehicleFactory=new VehicleFactory();
        Vehicle vehicle=vehicleFactory.createVehicle(VehicleType.CAR, "UP 32", 560);
        System.out.println("**********MAKING ENTRY************");
        parking.makeEntry(vehicle);
        System.out.println("*********TICKET************");
        System.out.println(vehicle.getTicket().toString());
        System.out.println("*********MAKING EXIT************");
        parking.makeExit(vehicle);
        System.out.println("*********EXIT COMPLETE************");
        
    }
}
