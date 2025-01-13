package Pseudocode;

import java.util.ArrayList;
import java.util.List;

public class Buyer extends User {
    private List<Transaction> transactions;

    public Buyer(String userId) {
        super(userId, "buyer");
        this.transactions = new ArrayList<>();
    }

    public void createProject(String title, String description, double budget) {
    	//Pseudocode  no logic yet
    }

    public void searchContractors(List<String> skills) {
    	//Pseudocode  no logic yet

    }

    public void hireContractor(String contractorId) {
    	//Pseudocode  no logic yet

        transactions.add(new Transaction(null, this.userId, contractorId, contractorId)); 
    }

    public void rateContractor(String contractorId, int rating) {
    	//Pseudocode  no logic yet

    }
}
