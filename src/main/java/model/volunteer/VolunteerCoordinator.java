/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.volunteer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.client.User;
import model.volunteer.Volunteer;

/**
 *
 * @author sahar
 */
public class VolunteerCoordinator {
    private Map<String, Volunteer> volunteers;

    public VolunteerCoordinator(){
        this.volunteers = new HashMap<>();
    }
    
    public void registerVolunteer(String id, String name, String email, String password){
        Volunteer volunteer = new Volunteer(id, name, email, password);
        this.volunteers.put(id, volunteer);
    }
    
    public void assignVolunteerTask(String volunteerId, String taskId, VolunteerTaskStatus status){
        Volunteer volunteer = this.volunteers.get(volunteerId);
        volunteer.assignTask(taskId, status);
    }
    
    public void updateVolunteerTaskStatus(String volunteerId, String taskId, VolunteerTaskStatus status){
        Volunteer volunteer = this.volunteers.get(volunteerId);
        volunteer.updateTaskStatus(taskId, status);
    }
    
    public void manageSchedule(String volunteerId, VolunteerSchedule schedule){
        Volunteer volunteer = this.volunteers.get(volunteerId);
        
    }
    
    public List<Volunteer> getAllVolunteers(){
        return new ArrayList<>(this.volunteers.values());
    }
    
    public Volunteer getVolunteer(String volunteerId){
        return this.volunteers.get(volunteerId);
    }
}
