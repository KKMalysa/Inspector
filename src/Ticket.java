import java.time.LocalTime;

public class Ticket {

    private final LocalTime buyTime;
    private final int ValidityTime;

    public Ticket(LocalTime buyTime, int validityTime) {
        this.buyTime = buyTime;
        ValidityTime = validityTime;
    }

    public LocalTime getBuyTime() {
        return buyTime;
    }

    public int getValidityTime() {
        return ValidityTime;
    }
}
