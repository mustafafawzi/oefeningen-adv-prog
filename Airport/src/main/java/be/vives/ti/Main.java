package be.vives.ti;

public class Main {
    public static void main(String[] args) {
        Passagier passagier = new Passagier("moustafa", "fawzi");
        Luchthaven luchthavenVertrek = new Luchthaven("Brussel");
        Luchthaven luchthavenAankomst = new Luchthaven("Parijs");
        Vliegtuig vliegtuig = new Vliegtuig("123", 1, 0, luchthavenVertrek);
        Ticket ticket = new Ticket(passagier, TicketType.ECONOMY);
        Vlucht vlucht = new Vlucht(luchthavenVertrek, luchthavenAankomst);
        vlucht.assignAirplane(vliegtuig);
        vlucht.addTicket(ticket);
        vlucht.printTickets();
    }
}