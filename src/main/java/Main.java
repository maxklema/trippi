// package trippi.example.com.example;

import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;

import javax.naming.directory.AttributeModificationException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Create an Administrator
        Administrator admin = new Administrator();

        // Create Experience Providers, approve through admin
        ExperienceProvider airlineProvider = new ExperienceProvider();
        admin.approveExperienceProvider(airlineProvider);

        // Create an Experience Provider Employee through Experience Provider
        ExperienceProviderEmployee employee = new ExperienceProviderEmployee(1, 1, "Harold Emp", "harrye",
                "harrye@seet.com");

        ExperienceProvider restaurantProvider = new ExperienceProvider();
        admin.approveExperienceProvider(restaurantProvider);

        // Create an Experience Provider Employee through Experience Provider
        ExperienceProviderEmployee employee2 = new ExperienceProviderEmployee(1, 1, "Harold Emp", "harrye",
                "harrye@seet.com", airlineProvider);
        airlineProvider.addEmployee(employee);

        // Add some Experiences through the Experience Provider

        // Create a Customer
        Customer newCustomer = new Customer(1, "4010 West Housing Drive", 260433590);

        // Create some Trips
        ArrayList<Availability> availabilities = new ArrayList<Availability>();
        HashSet<Review> reviews = new HashSet<Review>();
        ArrayList<PhotoObject> photos = new ArrayList<PhotoObject>();
        Experience experienceOne = new Experience(1, availabilities, photos, "Stay in the world famous Seet Hotel!",
                reviews);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = new sdf.parse("2025-04-23");
        Date endDate = new sdf.parse("2025-04-29");

        ScheduledExperience scheduledExperienceOne = new ScheduledExperience(experienceOne,
                "The best hotel in the world!", startDate, endDate);

        Trip tripOne = new Trip(1, new ArrayList<ScheduledExperience>(scheduledExperienceOne));

        // Schedule Experiences on the trips
        // Have the customer leave some Reviews
        // Remove a review through Admninistrator
    }
}