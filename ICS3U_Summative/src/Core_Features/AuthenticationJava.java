import java.util.HashMap;
import java.util.Map;

public class AuthenticationJava {

    private static final Map<String, String> users = new HashMap<>(); 

    static {
        // Sample user data (replace with proper database access)
        users.put("user1", "password1"); 
        users.put("user2", "password2"); 
    }
    //authentication function using a hashmap similar to a database lookup (LSM-tree)
    public static boolean authenticate(String username, String password) {
        if (users.containsKey(username) && users.get(username).equals(password)) {
            return true; // Authentication successful
        } else {
            return false; // Authentication failed
        }
    }

    public static void main(String[] args) {
        String username = "user1";
        String password = "password1";
        
        if (authenticate(username, password)) {
            System.out.println("Authentication successful!");
        } else {
            System.out.println("Authentication failed.");
        }
    }
}