import java.util.Date;

public record ScheduledExperience(
        Experience experience,
        String note,
        Date timeStart,
        Date timeEnd) implements Comparable<ScheduledExperience> {

    public int compareTo(ScheduledExperience other) {
        return timeStart.compareTo(other.timeStart);
    }

    @Override
    public final String toString() {
        return String.format("%s%nFrom %s to %s.", experience.toString(), timeStart.toString(),
                timeEnd.toString());
    }

}
