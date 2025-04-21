// package trippi.example.com.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
        public static void main(String[] args) throws ParseException {

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

                // CREATE AN ADMINISTRATOR
                // -----------------------------------
                Administrator admin = new Administrator("Stoat Jefferson", "jeffystoat", "jeffes@trippi.com");
                System.out.println("Admin " + admin.getName() + " was created.");

                // CREATE EXPERIENCE PROVIDERS, APPROVE THROUGH ADMIN
                // -----------------------------------
                ExperienceProvider airlineProvider = new ExperienceProvider("SEET Air", "air.seet.com", "@seet.com");
                System.out.println(airlineProvider.getName() + " was created!");
                admin.approveExperienceProvider(airlineProvider);

                // CREATE AN EXPERIENVCE PROVIDER EMPLOYEE THROUGH EXPERIENCE PROVIDER
                // -----------------------------------
                ExperienceProvider hotelProvider = new ExperienceProvider("SEET Villas", "seetvillas.com",
                                "@seetvillas.com");
                System.out.println(hotelProvider.getName() + " was created!");
                admin.approveExperienceProvider(hotelProvider);

                ExperienceProvider restaurantProvider = new ExperienceProvider("Cantankerous Crustaceon",
                                "cantacrust.com",
                                "@cantacrust.com");
                System.out.println(restaurantProvider.getName() + " was created!");
                admin.approveExperienceProvider(restaurantProvider);

                // CREATE EXPERIENCE PROVIDER EMPLOYEE THROUGH EXPERIENCE PROVIDER
                // -----------------------------------
                ExperienceProviderEmployee e = airlineProvider.createEmployeeAccount("Harold Emp", "harrye",
                                "harrye@seet.com");
                System.out.println("Created Employee: " + e.getName());

                e = hotelProvider.createEmployeeAccount("Jonas Schastanovich", "jonass", "jonass@seetvillas.com");
                System.out.println("Created Employee: " + e.getName());

                e = restaurantProvider.createEmployeeAccount("Signor Grancho", "mrkrab", "grancho@cantacrust.com");
                System.out.println("Created Employee: " + e.getName());

                // CREATE A CUSTOMER
                // -----------------------------------
                Customer newCustomer = new Customer("Joseph Mamara", "4010 West Housing Drive", 260433590);
                System.out.println("Created A Very foolish Customer:" + newCustomer.getName());

                // CREATE AN EXPERIENCE
                // -----------------------------------
                Experience hotelExperience = new Experience(1, "The SEET five star hotel!");

                // CREATE AVAILABILITIES
                // -----------------------------------
                Date spaDateAvailability = sdf.parse("2025-05-12");
                Date barDateAvailability = sdf.parse("2025-05-13");
                Date poolDateAvailability = sdf.parse("2025-05-17");

                hotelExperience.addAvailability(new Availability(spaDateAvailability, "Seet Hotel Spa"));
                hotelExperience.addAvailability(new Availability(barDateAvailability, "Seet Hotel Bar"));
                hotelExperience.addAvailability(new Availability(poolDateAvailability, "Seet Hotel Pool"));

                // CREATE PHOTOS
                // -----------------------------------
                hotelExperience.addPicture(new PhotoObject());
                hotelExperience.addPicture(new PhotoObject());

                // ADD REVIEWS
                // -----------------------------------
                Date reviewOneDate = sdf.parse("2025-03-12");
                Date ReviewTwoDate = sdf.parse("2025-02-27");

                Review reviewOne = new Review(1, newCustomer, hotelExperience,
                                "I had a great experience. I love the SEET hotel!", 5, 5, reviewOneDate);
                Review reviewTwo = new Review(2, newCustomer, hotelExperience, "The Seet Hotel spa is so great!! 11/10",
                                5, 5,
                                ReviewTwoDate);

                hotelExperience.addReview(reviewOne);
                hotelExperience.addReview(reviewTwo);

                Date startDate = sdf.parse("2025-04-23");
                Date endDate = sdf.parse("2025-04-29");

                // CREATE A SCHEDULED EXPERIENCE
                // -----------------------------------
                ScheduledExperience scheduledhotelExperience = new ScheduledExperience(hotelExperience,
                                "The best hotel in the world!", startDate, endDate);

                // CREATE A TRIP
                // -----------------------------------
                Trip tripOne = new Trip(1);
                tripOne.addExperienceToTrip(scheduledhotelExperience);
                System.out.println(tripOne.generateItenerary()); // print itenerary

                // REMOVE A REVIEW THROUGH AN ADMINISTRATOR
                // -----------------------------------
                admin.deleteReview(reviewOne);
                admin.deleteReview(reviewTwo);

                System.out.println("Testing Reviews ----------");

                Review review1 = new Review(0, newCustomer, hotelExperience, "This is a first review.", 5, 10,
                                new Date(0));
                System.out.println(review1.toString());

                Review review2 = new Review(0, newCustomer, hotelExperience, "This is a second review.", 5, 10,
                                new Date(0));
                System.out.println(review2.toString());
        }
}