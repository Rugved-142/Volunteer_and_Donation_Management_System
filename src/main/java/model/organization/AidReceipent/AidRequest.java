/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization.AidReceipent;

/**
 *
 * @author rugvedgundawar
 */
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class AidRequest {
    private final String requestId;
    private final String requestorName;
    private final double amountNeeded;
    private final String reason;
    private RequestStatus status;
    private final LocalDateTime requestDate;
    private LocalDateTime lastUpdated;
    AidReceipentProfile aidReceipentProfile;
    
    public enum RequestStatus {
        PENDING,
        APPROVED,
        REJECTED
    }
    
    public AidRequest(String requestorName, double amountNeeded, String reason,AidReceipentProfile aidReceipentProfile) {
        this.requestId = UUID.randomUUID().toString();
        this.requestorName = requestorName;
        this.amountNeeded = amountNeeded; 
        this.reason = reason;
        this.status = RequestStatus.PENDING;
        this.requestDate = LocalDateTime.now();
        this.lastUpdated = LocalDateTime.now();
        this.aidReceipentProfile = aidReceipentProfile;
    }
    
    // Status management
    public void setStatus(RequestStatus status) {
        this.status = status;
        this.lastUpdated = LocalDateTime.now();
    }
    
    // Getters
    public String getRequestId() {
        return requestId;
    }
    
    public String getRequestorName() {
        return requestorName;
    }
    
    public double getAmountNeeded() {
        return amountNeeded;
    }
    
    public String getReason() {
        return reason;
    }
    
    public RequestStatus getStatus() {
        return status;
    }
    
    public LocalDateTime getRequestDate() {
        return requestDate;
    }
    
    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }
    
    @Override
    public String toString() {
        return String.format("AidRequest{requestId='%s', requestor='%s', amount=%.2f, status=%s}",
                requestId, requestorName, amountNeeded, status);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AidRequest that = (AidRequest) o;
        return Objects.equals(requestId, that.requestId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(requestId);
    }
}
