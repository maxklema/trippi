public interface User {

    enum UserType {
        Customer,
        Administrator,
        ExperienceProviderEmployee
    }

    String getName();

    void setName(String name);

    String getEmail();

    void setEmail(String email);

    UserType getUserType();

    String getUsername();

    void setUsername(String username);

    // member methods
    void closeAccount();
}