import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private static final int GIGA = (int) Math.pow(10, 9);
    LocalDateTime currentLocalDate;

    public Gigasecond(LocalDate moment) {
        this.currentLocalDate = moment.atStartOfDay();
    }

    public Gigasecond(LocalDateTime moment) {
        this.currentLocalDate = moment;
    }

    public LocalDateTime getDateTime() {
        return this.currentLocalDate.plusSeconds(GIGA);
    }
}
