package Pseudocode;

import java.util.ArrayList;
import java.util.List;
public class Project {
    private String projectId;
    private String title;
    private String description;
    private double budget;
    private String buyerId;
    private String status; // "open", "in_progress", "completed"

    public Project(String projectId, String title, String description, double budget, String buyerId) {
        this.projectId = projectId;
        this.title = title;
        this.description = description;
        this.budget = budget;
        this.buyerId = buyerId;
        this.status = "open";
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getters and Setters for other fields (description, budget, buyerId, status)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}