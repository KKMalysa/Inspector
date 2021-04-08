import java.time.LocalTime;
import java.util.Random;

public class TicketMachine {

    public static Random random = new Random();

    public static void buyTicket(Passenger passenger, int validiyTime){
        Ticket ticket = new Ticket(LocalTime.of(random.nextInt(24),random.nextInt(60)),validiyTime);
        passenger.setTicket(ticket);
    }
}
