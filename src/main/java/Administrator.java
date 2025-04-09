public class Administrator {
    private int adminID;

    public int getAdminID() {
        return this.adminID;
    }

    public void setAdminID(int newAdminID) {
        this.adminID = newAdminID;
    }

    public Boolean deleteUser(User user) {
        System.out.println("User " + user.getUserID() + " Deleted");
        return true;
    }

    public Boolean deleteReview(Review review) {
        System.out.println("Review " + review.getReviewID() + " deleted");
        return true;
    }

    public Boolean approveExperienceProvider(ExperienceProvider experienceProvider) {
        System.out.println("Approved Experience Provider for " + experienceProvider.getName());
        return true;
    }

    public void closeAccount(User user) {
        System.out.println("Deleted account for " + user.getUserID());
    }

    public ExperienceProvider addExperienceProvider(String name, String website, String corporateEmail) {
        return new ExperienceProvider(name, website, corporateEmail);
    }
}
