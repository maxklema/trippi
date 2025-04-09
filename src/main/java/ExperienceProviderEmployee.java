import java.util.ArrayList;

public class ExperienceProviderEmployee implements User {

    private int userID;
    private int employeeID;
    private String name;
    public String userName;
    private String email;
    private User.UserType userType = User.UserType.ExperienceProviderEmployee;
    private ExperienceProvider employer;

    public ExperienceProviderEmployee(int userID, int employeeID, String name, String userName, String email, ExperienceProvider employer) {
        this.userID = userID;
        this.employeeID = employeeID;
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.employer = employer;
    }

    public int getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(int ID) {
        this.employeeID = ID;
    }

    public Experience addExperience(ArrayList<Availability> availabilities, ArrayList<PhotoObject> pictures, String description) {
        Experience e = new Experience(hashCode(), description);
        e.setAvailabilitySchedule(availabilities);
        e.setPictures(pictures);
        return e;
    }

    @Override
    public int getUserID() {
        return userID;
    }
    @Override
    public void setUserID(int ID) {
        this.userID = ID;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getEmail() {
        return email;
    }
    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public User.UserType getUserType() {
        return userType;
    }

    @Override
    public String getUsername() {
        return userName;
    }
    @Override
    public void setUsername(String userName) {
        this.userName = userName;
    }

    public ExperienceProvider getEmployer() {
        return employer;
    }
    public void setEmployer(ExperienceProvider employer) {
        this.employer = employer;
    }


    @Override
    public void closeAccount() {
    }
    
}
