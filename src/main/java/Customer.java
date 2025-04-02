public class Customer {
    private int customerID;
    private ArrayList<Trip> trips;
    private ArrayList<Review> reviews;
    private String address;
    private int phoneNumber;

    // constructor
    public Cusomter(int customerID, String address, int phoneNumber){
        this.customerID = customerID;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    private void addTrip(Trip trip) {
        this.trips.add(trip);
    }

    private ArrayList<Trip> getTrips() {
        return this.trips;
    }

    private Trip getTrip(int tripID){
        for (trip : this.trips){
            if (trip.getID() == tripID){
                return trip;
            }
        }
    }

    private Boolean hasTrip(int tripID) {
        for (trip : this.trips){
            if (trip.getID() == tripID){
                return true;
            }
        }
        return false;
    }

    private void addReview(Review review) {
        this.reviews.add(review);
    }

}
