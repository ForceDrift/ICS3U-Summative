package Pseudocode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KonstructDB {

    private static Map<String, User> users = new HashMap<>();
    private static List<Project> projects = new ArrayList<>();

    public static void main(String[] args) {

        // create sample user
        User user1 = new User("user123", "John Doe", "john.doe@example.com", "buyer");
        users.put(user1.getUserId(), user1);

        // create a sample project
        Project project1 = new Project("project456", "user123", "Kitchen Renovation", 0, null);
        projects.add(project1);

        // access and print user data
        User retrievedUser = users.get("user123");
        System.out.println("User Name: " + retrievedUser.getName());

        // acess and print project data
        for (Project project : projects) {
            System.out.println("Project ID: " + project.getProjectId() + ", Buyer ID: " + project.getBuyerId());
        }
    }
}