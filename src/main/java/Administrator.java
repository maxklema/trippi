public class Administrator {
    
    private String name;
    private String userName;
    private String email;
    
    public Administrator(String name, String userName, String email) {
        this.name = name;
        this.userName = userName;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return userName;
    }
    public void setUsername(String userName) {
        this.userName = userName;
    }

    public Boolean deleteUser(User user) {
        System.out.println("User " + user.getName() + " Deleted");
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
        System.out.println("Deleted account for " + user.getName());
    }

    public ExperienceProvider addExperienceProvider(String name, String website, String corporateEmail) {
        return new ExperienceProvider(name, website, corporateEmail);
    }
}
