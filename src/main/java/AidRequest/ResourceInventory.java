/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AidRequest;

/**
 *
 * @author sahar
 */
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ResourceInventory {
    private Map<Resource, Integer> inventory;
    private Map<Resource, Integer> minimumThresholds;
    private ArrayList<InventoryUpdateListener> updateListeners;
    private final Object lockObject = new Object();

    public ResourceInventory() {
        this.inventory = new ConcurrentHashMap<>();
        this.minimumThresholds = new HashMap<>();
        this.updateListeners = new ArrayList<>();
    }

    // Resource Management
    public void addResource(Resource resource, int quantity) {
        synchronized(lockObject) {
            if (quantity < 0) {
                throw new IllegalArgumentException("Quantity cannot be negative");
            }
            inventory.put(resource, inventory.getOrDefault(resource, 0) + quantity);
            checkThresholds(resource);
            notifyListeners(resource);
        }
    }

    public boolean deductResources(Map<Resource, Integer> resources) {
        synchronized(lockObject) {
            // First check if we have enough of all resources
            if (!hasAvailableResources(resources)) {
                return false;
            }

            // If we have enough, deduct them
            for (Map.Entry<Resource, Integer> entry : resources.entrySet()) {
                Resource resource = entry.getKey();
                int quantity = entry.getValue();
                int currentQuantity = inventory.getOrDefault(resource, 0);
                inventory.put(resource, currentQuantity - quantity);
                checkThresholds(resource);
                notifyListeners(resource);
            }
            return true;
        }
    }

    // Availability Checking
    public boolean hasAvailableResources(Map<Resource, Integer> requiredResources) {
        for (Map.Entry<Resource, Integer> entry : requiredResources.entrySet()) {
            Resource resource = entry.getKey();
            int requiredQuantity = entry.getValue();
            int availableQuantity = inventory.getOrDefault(resource, 0);
            if (availableQuantity < requiredQuantity) {
                return false;
            }
        }
        return true;
    }

    public boolean checkAvailability(Resource resource) {
        return inventory.getOrDefault(resource, 0) > minimumThresholds.getOrDefault(resource, 0);
    }

    // Threshold Management
    public void setMinimumThreshold(Resource resource, int threshold) {
        minimumThresholds.put(resource, threshold);
        checkThresholds(resource);
    }

    private void checkThresholds(Resource resource) {
        int currentQuantity = inventory.getOrDefault(resource, 0);
        int threshold = minimumThresholds.getOrDefault(resource, 0);
        if (currentQuantity <= threshold) {
            notifyLowStock(resource, currentQuantity, threshold);
        }
    }

    // Update Management
    public void updateResourceQuantity(Resource resource, int newQuantity) {
        synchronized(lockObject) {
            if (newQuantity < 0) {
                throw new IllegalArgumentException("Quantity cannot be negative");
            }
            inventory.put(resource, newQuantity);
            checkThresholds(resource);
            notifyListeners(resource);
        }
    }

    // Listener Pattern Implementation
    public void addUpdateListener(InventoryUpdateListener listener) {
        updateListeners.add(listener);
    }

    public void removeUpdateListener(InventoryUpdateListener listener) {
        updateListeners.remove(listener);
    }

    private void notifyListeners(Resource resource) {
        int quantity = inventory.getOrDefault(resource, 0);
        for (InventoryUpdateListener listener : updateListeners) {
            listener.onInventoryUpdate(resource, quantity);
        }
    }

    private void notifyLowStock(Resource resource, int currentQuantity, int threshold) {
        for (InventoryUpdateListener listener : updateListeners) {
            listener.onLowStock(resource, currentQuantity, threshold);
        }
    }

    // Getters
    public Map<Resource, Integer> getCurrentInventory() {
        return new HashMap<>(inventory);
    }

    public int getResourceQuantity(Resource resource) {
        return inventory.getOrDefault(resource, 0);
    }

    // Interface for inventory updates
    public interface InventoryUpdateListener {
        void onInventoryUpdate(Resource resource, int newQuantity);
        void onLowStock(Resource resource, int currentQuantity, int threshold);
    }
}
