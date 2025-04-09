// package trippi.example.com.example;

import javax.naming.directory.AttributeModificationException;

public class Main {
    public static void main(String[] args) {
        // Create an Administrator
        Administrator admin = new Administrator();

        // Create an Experience Provider, approve through admin
        ExperienceProvider airlineProvider = new ExperienceProvider();
        admin.approveExperienceProvider(airlineProvider);

        // Create an Experience Provider Employee through Experience Provider
        ExperienceProviderEmployee employee = new ExperienceProviderEmployee(1, 1, "Harold Emp", "harrye", "harrye@seet.com");

        // Airline, Hotel, Restaurant

        // Add some Experiences through the Experience Provider
        // Create a Customer
        // Create some Trips
        // Schedule Experiences on the trips
        // Have the customer leave some Reviews
        // Remove a review through Admninistrator
    }
}