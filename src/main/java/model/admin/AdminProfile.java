package model.admin;

import model.client.Person;
import model.client.PersonProfile;

public class AdminProfile extends PersonProfile{
    private Person person;
    private String name;
    private String email;
    private int phoneNumber;
    private String password;

    public AdminProfile(Person person, String name, String email, int phoneNumber, String password) {
        super(person);
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String getRole() {
        return "Admin";
    }
}
