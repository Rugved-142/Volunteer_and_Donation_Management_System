/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AidRequest;

/**
 *
 * @author sarthak deshmukh
 */
public class AidRequest {
    public enum AidRequestStatus {
        PENDING, APPROVED, REJECTED, FULFILLED
    }

    private String id;
    private String recipientId;
    private String details;
    private AidRequestStatus status;

    public AidRequest(String id, String recipientId, String details) {
        this.id = id;
        this.recipientId = recipientId;
        this.details = details;
        this.status = AidRequestStatus.PENDING;
    }

    public void updateStatus(AidRequestStatus newStatus) {
        this.status = newStatus;
    }

    // Getters
    public String getId() { return id; }
    public String getRecipientId() { return recipientId; }
    public String getDetails() { return details; }
    public AidRequestStatus getStatus() { return status; }
}
