/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization.VolunteerManagement;

import model.organization.VolunteerManagement.TimeSlot;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author sahar
 */
public class VolunteerSchedule {
    private Map<String, List<TimeSlot>>schedule;
    
    public VolunteerSchedule(){
        this.schedule = new HashMap<>();
    }
    
    
}
