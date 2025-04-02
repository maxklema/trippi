import java.util.ArrayList;

public class Trip 
{
    private int tripID;
    public ArrayList<ScheduledExperience> ScheduledExperiences;

    public int getTripID() {
        return tripID;
    }
    public void setTripID(int ID) {
        this.tripID = ID;
    }

    public String generateItenerary()
    {
       String toReturn = "Your Itenerary:\n";
       for(ScheduledExperience se : ScheduledExperiences)
       {
            toReturn+=se+"\n";
       }
       return toReturn;
    }

    public void addExperienceToTrip(ScheduledExperience ex )
    {
       ScheduledExperiences.add(ex);

    }

    public void removeExperienceFromTrip(int experienceID)
    {
        throw new UnsupportedOperationException("Not implemented");
    }
}
