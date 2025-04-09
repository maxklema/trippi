public class Administrator {
    private int adminID;

    public int getAdminID() {
        return this.adminID;
    }

    public void setAdminID(int newAdminID) {
        this.adminID = newAdminID;
    }

    public Boolean deleteUser(int userID) {
        System.out.println("User " + userID + " Deleted");
        return true;
    }

    public Boolean deleteReview(int reviewID) {
        System.out.println("Review " + reviewID + " deleted");
        return true;
    }

    public Boolean ApproveExperienceProvider(int experienceProviderID) {
        System.out.println("Approved Experience Provider for " + experienceProviderID);
        return true;
    }

    public void closeAccount(int userID) {
        System.out.println("Deleted account for " + userID);
    }

    public void addExperienceProvider(String name, String website, String corporateEmail) {
        System.out.println("Name: " + name + "\nWebsite: " + website + "\nCorporateEmail: " + corporateEmail);
    }
}
