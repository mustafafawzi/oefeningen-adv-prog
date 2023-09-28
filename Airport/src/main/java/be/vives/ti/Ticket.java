package be.vives.ti;

import java.util.ArrayList;

public class Ticket {
    private Passagier passagier;
    private TicketType ticketType;

    public Ticket(Passagier passagier, TicketType ticketType) {
        this.passagier = passagier;
        this.ticketType = ticketType;
    }

    public Passagier getPassagier() {
        return passagier;
    }

    public void setPassagier(Passagier passagier) {
        this.passagier = passagier;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

    public void setTicketType(TicketType ticketType) {
        this.ticketType = ticketType;
    }

    public String toString() {
        return "Passagier: " + passagier.getVm() + " " + passagier.getAn() + ", Tickettype: " + ticketType;
    }
}
