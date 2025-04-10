import java.util.ArrayList;
import java.util.HashSet;

public class Experience {

    private int experienceID;
    private ArrayList<Availability> availabilitySchedule;
    private ArrayList<PhotoObject> pictures;
    private String description;
    private HashSet<Review> reviews;

    public Experience(int experienceID) {
        this.experienceID = experienceID;
        availabilitySchedule = new ArrayList<>();
        pictures = new ArrayList<>();
        description = "";
        reviews = new HashSet<>();
    }

    public Experience(int experienceID, String description) {
        this.experienceID = experienceID;
        availabilitySchedule = new ArrayList<>();
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

    public ArrayList<Availability> getAvailabilitySchedule() {
        return availabilitySchedule;
    }

    public void addAvailability(Availability a) {
        System.out.println("New availability added at: " + a.getDate());
        this.availabilitySchedule.add(a);
    }

    public void removeAvailability(Availability a) {
        this.availabilitySchedule.remove(a);
    }

    public void setAvailabilitySchedule(ArrayList<Availability> availabilities) {
        this.availabilitySchedule = availabilities;
    }

    public void clearAvailabilitySchedule() {
        this.availabilitySchedule.clear();
    }

    public ArrayList<PhotoObject> getPictures() {
        return pictures;
    }

    public void addPicture(PhotoObject picture) {
        System.out.println("New Photo Uploaded!");
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
        System.out.println(
                "New Review added: " + review.getContents());
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

    @Override
    public String toString() {
        return "Experience{" +
                "experienceID=" + experienceID +
                ", availabilityCount=" + (availabilitySchedule != null ? availabilitySchedule.size() : 0) +
                ", pictureCount=" + (pictures != null ? pictures.size() : 0) +
                ", description='" + description + '\'' +
                ", reviewCount=" + (reviews != null ? reviews.size() : 0) +
                '}';
    }

}