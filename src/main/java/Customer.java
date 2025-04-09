import java.util.ArrayList;

public class Customer implements User {
    private String name;
    private ArrayList<Trip> trips;
    private ArrayList<Review> reviews;
    private String address;
    private int phoneNumber;
    private User.UserType userType = User.UserType.Customer;
    private String email;
    private int userID;

    // constructor
    public Customer(String name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTrip(Trip trip) {
        this.trips.add(trip);
    }

    public ArrayList<Trip> getTrips() {
        return this.trips;
    }

    public Trip getTrip(int tripID) {
        for (Trip trip : this.trips) {
            if (trip.getTripID() == tripID) {
                return trip;
            }
        }
        return null;
    }

    public Boolean hasTrip(int tripID) {
        for (Trip trip : this.trips) {
            if (trip.getTripID() == tripID) {
                return true;
            }
        }
        return false;
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }

    @Override
    public void closeAccount() {
        System.out.println(this.name + " account was closed!");
    }

    @Override
    public void setUsername(String name) {
        this.name = name;
    }

    @Override
    public String getUsername() {
        return this.name;
    }

    @Override
    public User.UserType getUserType() {
        return this.userType;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

}
