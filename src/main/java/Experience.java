import java.util.ArrayList;
import java.util.HashSet;

public class Experience {

    private int experienceID;
    private ArrayList<PhotoObject> pictures;
    private String description;
    private HashSet<Review> reviews;

    public Experience(int experienceID) {
        this.experienceID = experienceID;
        pictures = new ArrayList<>();
        description = "";
        reviews = new HashSet<>();
    }

    public Experience(int experienceID, String description) {
        this.experienceID = experienceID;
        pictures = new ArrayList<>();
        this.description = description;
        reviews = new HashSet<>();
    }

    public int getExperienceID() {
        return experienceID;
    }
    public void setExperienceID(int ID) {
        this.experienceID = ID;
    }

    public ArrayList<PhotoObject> getPictures() {
        return pictures;
    }
    public void addPicture(PhotoObject picture) {
        this.pictures.add(picture);
    }
    public void removePicture(PhotoObject picture) {
        this.pictures.remove(picture);
    }
    public void setPictures(ArrayList<PhotoObject> pictures) {
        this.pictures = pictures;
    }
    public void clearPictures() {
        this.pictures.clear();
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public HashSet<Review> getReviews() {
        return reviews;
    }
    public void addReview(Review review) {
        this.reviews.add(review);
    }
    public void removeReview(Review review) {
        this.reviews.remove(review);
    }
    public void setReviews(HashSet<Review> reviews) {
        this.reviews = reviews;
    }
    public void clearReviews() {
        this.reviews.clear();
    }

}