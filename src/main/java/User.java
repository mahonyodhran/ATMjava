package main.java;

public class User {
    private static User singleUser = null;
    int uuid;
    String firstName;
    String lastName;
    String email;

    private User() {
        uuid = 1;
        firstName = "John";
        lastName = "Doe";
        email = firstName + lastName + "@atm.com";
    }

    public static User getUser(){
        if (singleUser == null){
            singleUser = new User();
        }
        return singleUser;
    }

    public int getUuid() {
        return uuid;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
                + ", uuid=" + uuid + "]";
    }

    
}
