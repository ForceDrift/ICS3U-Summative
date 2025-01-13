package Pseudocode;

public class User {
    protected String userId;
    private String userType; // "buyer" or "seller"

    public User(String userId, String userType) {
        this.userId = userId;
        this.userType = userType;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserType() {
        return userType;
    }
}
