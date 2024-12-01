/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Campaign;

/**
 *
 * @author sarthak deshmukh
 */
public class Donation {
    public enum DonationType {
        MONETARY, GOODS, SERVICES
    }

    private String id;
    private double amount;
    private DonationType type;
    private String donorId;
    private String campaignId;
    private String status;

    public Donation(String id, double amount, DonationType type, 
                    String donorId, String campaignId) {
        this.id = id;
        this.amount = amount;
        this.type = type;
        this.donorId = donorId;
        this.campaignId = campaignId;
        this.status = "PENDING";
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    // Getters
    public String getId() { return id; }
    public double getAmount() { return amount; }
    public DonationType getType() { return type; }
    public String getDonorId() { return donorId; }
    public String getCampaignId() { return campaignId; }
    public String getStatus() { return status; }
}
