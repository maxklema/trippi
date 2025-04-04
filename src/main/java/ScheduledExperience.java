import java.util.Date;

public record ScheduledExperience(
    Experience experience,
    String note,
    Date timeStart,
    Date timeEnd
) implements Comparable<ScheduledExperience> {


    @Override
    public final String toString() {
        return String.format("%s%nFrom %s to %s.", experience.toString(), timeStart.toString(), timeEnd.toString());
    }

    @Override
    public int compareTo(ScheduledExperience o) {
        return this.toString().equals(o.toString()) ? 0 : 1;
    }

}
