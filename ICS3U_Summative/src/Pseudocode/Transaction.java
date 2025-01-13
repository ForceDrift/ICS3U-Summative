package Pseudocode;

public class Transaction {
    private String transactionId;
    private String projectId;
    private String buyerId;
    private String contractorId;
    private String status; // "pending", "accepted", "completed", "cancelled"
    private String paymentStatus; // "unpaid", "pending", "paid"

    public Transaction(String transactionId, String projectId, String buyerId, String contractorId) {
        this.transactionId = transactionId;
        this.projectId = projectId;
        this.buyerId = buyerId;
        this.contractorId = contractorId;
        this.status = "pending";
        this.paymentStatus = "unpaid";
    }

	public void setStatus(String string) {
		// TODO Auto-generated method stub
		
	}

}

