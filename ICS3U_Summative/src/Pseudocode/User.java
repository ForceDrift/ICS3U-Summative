package Pseudocode;

class User {
    protected String userId;
    private String name;
    private String email;
    private String userType; // "buyer" or "seller"

    public User(String userId, String name, String email, String userType) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.userType = userType;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    // Getters and setters for other attributes
}