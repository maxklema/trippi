import java.util.ArrayList;

public class ReviewManager {

    private static ArrayList<Review> reviews = new ArrayList<>();

    public static ArrayList<Review> getReviews() {
        return reviews;
    }

    public static void addReview(Review review) {
        reviews.add(review);
    }

    public static void removeReview(Review review) {
        reviews.remove(review);
    }

}