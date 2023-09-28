package be.vives.ti;

import java.util.ArrayList;

public class Vlucht {
    private final Luchthaven vertrekHaven;
    private final Luchthaven aankomstHaven;
    private Vliegtuig vliegtuig;
    private ArrayList<Ticket> tickets;


    public Vlucht(Luchthaven vertrekHaven, Luchthaven aankomstHaven) {
        this.vertrekHaven = vertrekHaven;
        this.aankomstHaven = aankomstHaven;
        this.tickets = new ArrayList<>();
    }

    public void assignAirplane(Vliegtuig vliegtuig) {
        if (vliegtuig.getHuidigeLuchthaven().getNaam().equalsIgnoreCase(vertrekHaven.getNaam())) {
            this.vliegtuig = vliegtuig;
        } else {
            throw new IllegalArgumentException("vliegtuig is hier niet aanwezig");
        }

    }

    public Luchthaven getVertrekHaven() {
        return vertrekHaven;
    }

    public Luchthaven getAankomstHaven() {
        return aankomstHaven;
    }

    public Vliegtuig getVliegtuig() {
        return vliegtuig;
    }

    public void printTickets() {
        for (Ticket ticket : tickets) {
            System.out.println(ticket);
        }
    }

    public void addTicket(Ticket ticket) {
        int beschikbaarEco = vliegtuig.getAantal_plaatsen_eco();
        int beschikbareBus = vliegtuig.getGetAantal_plaatsen_bus();

        if (ticket.getTicketType().equals(TicketType.ECONOMY)) {
            if (beschikbaarEco == 0) {
                throw new IllegalStateException("er zijn niet genoeg plaatsen in eco");
            } else {
                tickets.add(ticket);
                beschikbaarEco--;
            }
        } else {
            if (beschikbareBus == 0) {
                throw new IllegalStateException("er zijn niet genoeg plaatsen in bus");
            } else {
                tickets.add(ticket);
                beschikbareBus--;
            }
        }
    }
}

