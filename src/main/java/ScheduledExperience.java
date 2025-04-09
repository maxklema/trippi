public record ScheduledExperience implements Comparable<ScheduledExperience>
{
    record ScheduledExperience(
        Experience experience,
        String note,
        Date timeStart,
        Date timeEnd
    ){}


    compareTo(ScheduledExperience other)
    {
        return timeStart.compareTo(other.timeStart);
    }

    @Override
    public final String toString() {
        return experience.toString()+"\n    From "+timeStart+" to "+timeEnd;
    }

}
