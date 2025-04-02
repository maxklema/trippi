public class Administrator {
    private int AdminID;

    private Boolean deleteUser(int userID) {
        System.out.println("User " + userID + " Deleted");
        return true;
    }

    private Boolean deleteReview(int reviewID) {
        System.out.println("Review " + reviewID + " deleted");
        return true;
    }

    private Boolean ApproveExperienceProvider(int experienceProviderID) {
        System.out.println("Approved Experience Provider for " + experienceProviderID);
        return true;
    }

    private void closeAccount(int userID) {
        System.out.println("Deleted account for " + userID);
    }

    private void addExperienceProvider(String name, String website, String corporateEmail) {
        System.out.println("Name: " + name + "\nWebsite: " + website + "\nCorporateEmail: " + corporateEmail);
    }

}
