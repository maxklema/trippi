import java.util.ArrayList;

public class Trip {
    private int tripID;
    public ArrayList<ScheduledExperience> ScheduledExperiences;

    public Trip(int tripID) {
        this.tripID = tripID;
        ScheduledExperiences = new ArrayList<ScheduledExperience>();

    }

    public int getTripID() {
        return tripID;
    }

    public void setTripID(int ID) {
        this.tripID = ID;
    }

    public String generateItenerary() {
        StringBuilder result = new StringBuilder();
        result.append("Your Itenerary:\n");
        for (ScheduledExperience se : ScheduledExperiences) {
            result.append(se.toString()).append("\n");
        }
        return result.toString();
    }

    public void addExperienceToTrip(ScheduledExperience ex) {
        ScheduledExperiences.add(ex);

    }

    public void removeExperienceFromTrip(int experienceID) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
