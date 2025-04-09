import java.util.ArrayList;
import java.util.List;

public class ExperienceProvider {
    private int ExperienceProviderID;
    private String name;
    private ArrayList<Experience> experiences;
    private String website;
    private String corporateEmail;
    private ExperienceProviderEmployee owner;
    private ArrayList<ExperienceProviderEmployee> employees;

    public ExperienceProvider(String name, String website, String email) {
        ExperienceProviderID = 999;
        this.name = name;
        this.website = website;
        this.corporateEmail = email;
        owner = null;
        employees = new ArrayList<ExperienceProviderEmployee>();
        experiences = new ArrayList<Experience>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Experience> getExperiences() {
        return experiences;
    }

    public ExperienceProviderEmployee createEmployeeAccount(String name, String email, String username) {
        ExperienceProviderEmployee e = new ExperienceProviderEmployee(name, username, email, this);
        employees.add(e);
        return e;
    }

    public void closeEmployeeAccount(User employee) {
        if (!(employee instanceof ExperienceProviderEmployee)) {
            return;
        }

        employees.remove((ExperienceProviderEmployee) employee);
    }

    public void addOwner(ExperienceProviderEmployee e) {
        owner = e;
    }

}
