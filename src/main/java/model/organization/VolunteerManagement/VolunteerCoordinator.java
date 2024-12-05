/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization.VolunteerManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author sahar
 */
public class VolunteerCoordinator {
    private Map<String, VolunteerProfile> volunteers;

    public VolunteerCoordinator(){
        this.volunteers = new HashMap<>();
    }
    
    public void approveVolunteerRequest(VolunteerProfile vp){
        vp.approveRegitrationRequest();
        this.volunteers.put(vp.getPerson().getPersonId(), vp);
    }
    
    public void assignVolunteerTask(String volunteerId, String taskId, VolunteerTaskStatus status){
        VolunteerProfile volunteer = this.volunteers.get(volunteerId);
        volunteer.assignTask(taskId, status);
    }
    
    public void updateVolunteerTaskStatus(String volunteerId, String taskId, VolunteerTaskStatus status){
        VolunteerProfile volunteer = this.volunteers.get(volunteerId);
        volunteer.updateTaskStatus(taskId, status);
    }
    
    public void manageSchedule(String volunteerId, VolunteerSchedule schedule){
        VolunteerProfile volunteer = this.volunteers.get(volunteerId);
        
    }
    
    public List<VolunteerProfile> getAllVolunteers(){
        return new ArrayList<>(this.volunteers.values());
    }
    
    public VolunteerProfile getVolunteer(String volunteerId){
        return this.volunteers.get(volunteerId);
    }
}
