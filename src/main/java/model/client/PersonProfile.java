/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.client;

/**
 *
 * @author Sarthak
 */
public abstract class PersonProfile {

    Person person;

    public PersonProfile(Person p) {
        person = p;

    }

    public abstract String getRole();

    public Person getPerson() {
        return person;
    }

    public boolean isMatch(String id) {
        if (person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }
}
