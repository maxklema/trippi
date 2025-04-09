public class Administrator {
    private int adminID;

    private int getAdminID() {
        return this.adminID;
    }

    private void setAdminID(int newAdminID) {
        this.adminID = newAdminID;
    }

    private Boolean deleteUser(User user) {
        System.out.println("User " + user.getUserID() + " Deleted");
        return true;
    }

    private Boolean deleteReview(Review review) {
        System.out.println("Review " + review.getReviewID() + " deleted");
        return true;
    }

    private Boolean ApproveExperienceProvider(ExperienceProvider experienceProvider) {
        System.out.println("Approved Experience Provider for " + experienceProvider.getName());
        return true;
    }

    private void closeAccount(User user) {
        System.out.println("Deleted account for " + user.getUserID());
    }

    private ExperienceProvider addExperienceProvider(String name, String website, String corporateEmail) {
        return newExperienceProvider(name, website, corporateEmail);
    }
}
