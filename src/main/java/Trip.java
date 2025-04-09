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
       StringBuilder result = new StringBuilder();
       result.append("Your Itenerary:\n");
       for(ScheduledExperience se : ScheduledExperiences)
       {
            result.append(se.toString()).append("\n");
       }
       return result.toString();
    }

    public void addExperienceToTrip(ScheduledExperience ex )
    {
       
        ScheduledExperiences.add(ex);

    }

    public void removeExperienceFromTrip(Experience e)
    {
        for(ScheduledExperience se: ScheduledExperiences )
        {
            if(se.experience == e){
                ScheduledExperiences.remove(se);
                return;
            }
        }
        
    }
}
