// package trippi.example.com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {

        // Create an Administrator
        Administrator admin = new Administrator("Stoat Jefferson", "jeffystoat", "jeffes@trippi.com");

        // Create Experience Providers, approve through admin
        ExperienceProvider airlineProvider = new ExperienceProvider("SEET Air", "air.seet.com", "@seet.com");
        System.out.println(airlineProvider.getName() + " was created!");
        admin.approveExperienceProvider(airlineProvider);
        
        // Create an Experience Provider Employee through Experience Provider
        ExperienceProvider hotelProvider = new ExperienceProvider("SEET Villas", "seetvillas.com", "@seetvillas.com");
        System.out.println(hotelProvider.getName() + " was created!");
        admin.approveExperienceProvider(hotelProvider);

        ExperienceProvider restaurantProvider = new ExperienceProvider("Cantankerous Crustaceon", "cantacrust.com",
                "@cantacrust.com");
        System.out.println(restaurantProvider.getName() + " was created!");
        admin.approveExperienceProvider(restaurantProvider);

        // Create an Experience Provider Employee through Experience Provider
        ExperienceProviderEmployee e = airlineProvider.createEmployeeAccount("Harold Emp", "harrye", "harrye@seet.com");
        System.out.println("Created Employee: "+e.getName());

        e= hotelProvider.createEmployeeAccount("Jonas Schastanovich", "jonass", "jonass@seetvillas.com");
        System.out.println("Created Employee: "+e.getName());

        e= restaurantProvider.createEmployeeAccount("Signor Grancho", "mrkrab", "grancho@cantacrust.com");
        System.out.println("Created Employee: "+e.getName());

        // Create a Customer
        Customer newCustomer = new Customer("Joe Mama", "4010 West Housing Drive", 260433590);
        System.out.println("Created A Very foolish Customer:"+newCustomer.getName());

        // Create some Trips
        ArrayList<Availability> availabilities = new ArrayList<Availability>();
        HashSet<Review> reviews = new HashSet<Review>();
        ArrayList<PhotoObject> photos = new ArrayList<PhotoObject>();
        Experience experienceOne = new Experience(1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = sdf.parse("2025-04-23");
        Date endDate = sdf.parse("2025-04-29");

        ScheduledExperience scheduledExperienceOne = new ScheduledExperience(experienceOne,
                "The best hotel in the world!", startDate, endDate);

        ArrayList<ScheduledExperience> scheduledExperiences = new ArrayList<ScheduledExperience>();
        scheduledExperiences.add(scheduledExperienceOne);

        Trip tripOne = new Trip(1);
    }
}