// package trippi.example.com.example;

import javax.naming.directory.AttributeModificationException;

public class Main {
    public static void main(String[] args) {
        // Create an Administrator
        Administrator admin = new Administrator();

        // Create Experience Providers, approve through admin
        ExperienceProvider airlineProvider = new ExperienceProvider();
        admin.approveExperienceProvider(airlineProvider);

        ExperienceProvider hotelProvider = new ExperienceProvider();
        admin.approveExperienceProvider(hotelProvider);

        ExperienceProvider restaurantProvider = new ExperienceProvider();
        admin.approveExperienceProvider(restaurantProvider);

        // Create an Experience Provider Employee through Experience Provider
        airlineProvider.createEmployeeAccount("Harold Emp", "harrye", "harrye@seet.com");

        hotelProvider.createEmployeeAccount("Jonas Schastanovich", "jonass", "jonass@seetvillas.com");

        restaurantProvider.createEmployeeAccount("Signor Grancho", "mrkrab", "grancho@cantacrust.com");

        // Add some Experiences through the Experience Provider
        airlineProvider.addExperience(new Experience(1, "Fly to Norway"));
        airlineProvider.addExperience(new Experience(2, "Fly to Japan"));
        airlineProvider.addExperience(new Experience(3, "Fly to Norway"));
        hotelProvider.addExperience(new Experience(4, "Stay in London"));
        hotelProvider.addExperience(new Experience(5, "Stay in Chicago"));
        hotelProvider.addExperience(new Experience(6, "Stay in Rome"));
        restaurantProvider.addExperience(new Experience(7, "Eat at Cantankerous Crustaceon in Rome"));
        restaurantProvider.addExperience(new Experience(8, "Eat at Cantankerous Crustaceon in Bikini Atoll"));
        restaurantProvider.addExperience(new Experience(9, "Eat at Cantankerous Crustaceon in Aberdeen"));

        // Create a Customer
        // Create some Trips
        // Schedule Experiences on the trips
        // Have the customer leave some Reviews
        // Remove a review through Admninistrator
    }
}