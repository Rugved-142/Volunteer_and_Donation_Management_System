/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.volunteer;

/**
 *
 * @author sahar
 */
public class VolunteerTask {
    private String id;
    private VolunteerTaskStatus status;
    
    public VolunteerTask(String id, VolunteerTaskStatus status){
        this.id = id;
        this.status = status;
    }
    
}
