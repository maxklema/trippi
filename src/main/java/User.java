public interface User {

    enum UserType {
        Customer,
        Administrator,
        ExperienceProviderEmployee
    }

    int getUserID();
    int setUserID(int ID);
    String getName();
    void setName(String name);
    String getEmail();
    void setEmail(String email);
    UserType getUserType();
    void setUserType(UserType userType);
    String getUsername();
    void setUsername(String username);

    // member methods
    void closeAccount();
}