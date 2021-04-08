public class Main {

    public static void main(String[] args) {

        Passenger[] passengers = new Passenger[3];
        passengers[0] = new Passenger("Jan", "Kowalski");
        passengers[1] = new Passenger("Karol", "Kowalski");
        passengers[2] = new Passenger("Adam", "Kowalski");

        TicketMachine.buyTicket(passengers[0], 130);
        TicketMachine.buyTicket(passengers[2], 30);

        TicketController.validate(passengers);
        TicketController.printWithTickets(passengers);
    }
}
