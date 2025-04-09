public class ExperienceProvider 
{
    private int ExperienceProviderID;
    private String name;
    private ArrayList<Experience> experiences;
    private String website;
    private string corporateEmail;
    private ExperienceProviderEmployee owner;
    private ArrayList<ExperienceProviderEmployee> employees;

    
    
    public ExperienceProvider(String name, String website, String email)
    {
        ExperienceProviderID = 999;
        this.name = name;
        this.website = website;
        this.corporateEmail = email;
        owner = null;
        employees = new ArrayList<ExperienceProviderEmployee>();
        experiences = new ArrayLIst<Experience>();

    }
    

    public List<Experience> getExperiences()
    {
        return experiences;
    }

    public createEmployeeAccount(String name, String email, String username)
    {
        employees.add(new ExperienceProviderEmployee(666, ExperienceProviderID, name, username, email));
    }

    public closeEmployeeAccount(User employee)
    {
        if(!employee instanceof ExperienceProviderEmployee)
        {
            return;
        }

        employees.remove((ExperienceProviderEmployee)employee);
    }

    public addOwner(Employee e)
    {
        owner = e;
    }

}
