package Pseudocode;

import java.util.ArrayList;
import java.util.List;

public class Contractor extends User {
    private List<String> skills;
    private List<Transaction> transactions;

    public Contractor(String userId) {
        super(userId, "contractor", userId, userId);
        this.skills = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    public void addSkill(String skill) {
        this.skills.add(skill);
    }

    public void bidOnProject(String projectId, double bidAmount) {
        // Submit a bid for a project
    }

    public void acceptJob(Transaction transaction) {
        transaction.setStatus("accepted");
    }

    public void completeJob(Transaction transaction) {
        transaction.setStatus("completed");
    }
}
