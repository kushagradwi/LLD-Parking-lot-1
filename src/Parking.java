

import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

import Models.Gate.Gate;
import Models.ParkingSlot.ParkingSlots;
import Models.Payment.Payment;
import Models.Payment.PaymentStratergy;
import Models.Ticket.Ticket;
import Models.Vehicle.Vehicle;
import Service.PaymentService;

class Parking{
    List <ParkingSlots> parkingSlots;
    //List <Gate> gates;

    public Parking(List<ParkingSlots> parkingSlots) {
        this.parkingSlots = parkingSlots;
        //this.gates=gates;
    }
    /*public ParkingSlots findNearestParkingSlot(Vehicle vehicle){
        int l=parkingSlots.size();
        for(int i=0;i<l;i++){
            ParkingSlots temp=parkingSlots.get(i);
            if(!temp.getParkingSlotStatus() && temp.checkCompatibility(vehicle)) return temp;
        }
        System.out.println("No available Parking slot for this type.");
        return null;
    }*/
    public void makeEntry(Vehicle vehicle){
        ParkingSlots allotedParkingSlot=checkCompatibility(vehicle);
        if(allotedParkingSlot==null){
            System.out.println("Parking is full.");
        }{
            Ticket ticket=new Ticket(vehicle, allotedParkingSlot);
            vehicle.setTicket(ticket);
            allotedParkingSlot.setIsOccupied(true);
            System.out.println("Vehicle is parked at"+ allotedParkingSlot.getId());
        }
    }
    public void makeExit(Vehicle vehicle){
        Boolean transactionStatus=false;
        while(transactionStatus==false){
        Ticket ticket=vehicle.getTicket();
        Double fare=calculateFare(vehicle,vehicle.getTicket().getEntryTime().plusHours(1) ,ticket);
        Scanner sc= new Scanner(System.in);
        PaymentService paymentService=new PaymentService(sc);
        Payment payment= paymentService.PaymentMethod(fare);
        if(payment.getIsProcessed()){
            System.out.println("Transaction is Complete");
            vehicle.getTicket().getParkingSlot().setIsOccupied(false);
            break;
        }else{
            System.out.println("Transaction Failed. Try Again");
        }
    }
    }
    private ParkingSlots checkCompatibility(Vehicle vehicle){
        int l=parkingSlots.size();
        for(ParkingSlots parkingSlot: parkingSlots){
            if(parkingSlot.checkCompatibility(vehicle)) return parkingSlot;
        }
        return null;
    }
    Double calculateFare(Vehicle vehicle,LocalTime exitTime,Ticket ticket){
        Duration duration=Duration.between(ticket.getEntryTime(), exitTime);
        if(vehicle.getWeight()<200){
            return (duration.toHours())*50.0;
        }
        else if(vehicle.getWeight()>200 && vehicle.getWeight()<2000){
            return (duration.toHours())*100.0;
        }else{
            return (duration.toHours())*200.0;
        }
    }

}