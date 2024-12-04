/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.staff;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import model.client.User;
import model.client.Volunteer;

/**
 *
 * @author sahar
 */
public class VolunteerCoordinator extends User {
    private ArrayList<Volunteer> volunteers;
    private Map<String, Schedule> volunteerSchedules;

    public VolunteerCoordinator(String name, String email, String password, String phoneNumber) {
        super(name, email, password, phoneNumber);
        this.volunteers = new ArrayList<>();
        this.volunteerSchedules = new HashMap<>();
    }

    public void assignVolunteer(Volunteer volunteer, Task task) {
        // Implementation
    }

    public void manageSchedule(String volunteerId, Schedule schedule) {
        // Implementation
    }
}
