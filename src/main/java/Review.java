import java.util.Date;

public class Review {

    private int reviewID;
    private User reviewUser;
    private Experience reviewExperience;
    private String contents;
    private int experienceRating;
    private int helpfulRating;
    private Date dateTime;

    public Review(int reviewID, User reviewUser, Experience reviewExperience, String contents, int experienceRating,
            int helpfulRating, Date dateTime) {
        this.reviewID = reviewID;
        this.reviewUser = reviewUser;
        this.reviewExperience = reviewExperience;
        this.contents = contents;
        this.experienceRating = experienceRating;
        this.helpfulRating = helpfulRating;
        this.dateTime = dateTime;

        this.addReview();
    }

    private void addReview() {
        ReviewManager.addReview(this);
    }

    public int getReviewID() {
        return reviewID;
    }

    public void setReviewID(int ID) {
        this.reviewID = ID;
    }

    public User getReviewUser() {
        return reviewUser;
    }

    public void setReviewUser(User user) {
        this.reviewUser = user;
    }

    public Experience getReviewExperience() {
        return reviewExperience;
    }

    public void setReivewExperience(Experience experience) {
        this.reviewExperience = experience;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public int getExperienceRating() {
        return experienceRating;
    }

    public void setExperienceRating(int rating) {
        this.experienceRating = rating;
    }

    public void addExperienceRating(int rating) {
        this.experienceRating += rating;
    }

    public int getHelpfulRating() {
        return helpfulRating;
    }

    public void setHelpfulRating(int rating) {
        this.helpfulRating = rating;
    }

    public void addHelpfulRating(int rating) {
        this.helpfulRating += rating;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

}
