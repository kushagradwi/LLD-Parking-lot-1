package Models.Vehicle;

import Models.Ticket.Ticket;

public abstract class Vehicle {
    String liscencePlate;
    int weight;
    Ticket ticket;
    public Ticket getTicket() {
        return ticket;
    }
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    public String getLiscencePlate() {
        return liscencePlate;
    }
    public int getWeight() {
        return weight;
    }
    
}
