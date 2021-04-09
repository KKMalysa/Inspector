import java.time.Duration;
import java.time.LocalTime;

public class TicketController {


    public static final int SECONDS_IN_MINUTE = 60;

    public static Passenger[] validate(Passenger[] passengers){
        Passenger[] withoutTicket = new Passenger[passengers.length];
        int j =0;
        for (int i=0; i<passengers.length; i++){
            if(passengers[i].getTicket() != null){
                Duration duration = Duration.between(passengers[i].getTicket().getBuyTime(), LocalTime.now());
                if(duration.getSeconds() > passengers[i].getTicket().getValidityTime()* SECONDS_IN_MINUTE){
                  withoutTicket[j] = passengers[i];
                  j++;
                }
            }
        }
        return withoutTicket;
    }


    public static void printWithTickets(Passenger[]passengers){
        System.out.println("Pasazerowie z biletem:");
        for (Passenger p : validate(passengers)){
            if(p != null){
                System.out.println(p.getFirstName()+ " "+ p.getLastName());
            }
        }

    }



}
