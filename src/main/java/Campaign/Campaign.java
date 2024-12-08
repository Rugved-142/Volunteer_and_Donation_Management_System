///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Campaign;
//
///**
// *
// * @author sarthak deshmukh
// */
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//public class Campaign {
//    private String id;
//    private String title;
//    private String description;
//    private String location;
//    private Date date;
//    private List<String> participants;
//
//    public Campaign(String id, String title, String description, 
//                    String location, Date date) {
//        this.id = id;
//        this.title = title;
//        this.description = description;
//        this.location = location;
//        this.date = date;
//        this.participants = new ArrayList<>();
//    }
//
//    public void addParticipant(String volunteerId) {
//        participants.add(volunteerId);
//    }
//
//    // Getters
//    public String getId() { return id; }
//    public String getTitle() { return title; }
//    public String getDescription() { return description; }
//    public String getLocation() { return location; }
//    public Date getDate() { return date; }
//    public List<String> getParticipants() { return participants; }
//}