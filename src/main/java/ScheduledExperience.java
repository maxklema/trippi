public record ScheduledExperience implements Comparable<ScheduledExperience>
{
    record ScheduledExperience(
        Experience experience,
        String note,
        Date timeStart,
        Date timeEnd
    ){}


    @Override
    public final String toString() {
        return experience.toString()+"\n    From "+timeStart+" to "+timeEnd;
    }

}
