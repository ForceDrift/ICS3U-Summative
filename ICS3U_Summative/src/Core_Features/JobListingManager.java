package Core_Features;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JobListingManager {
    //initalize a map of job listings key --> job title and value --> JobListing object
    private static Map<String, JobListing> jobListings = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Create Job Listing");
            System.out.println("2. View Job Listings");
            System.out.println("3. Exit");

            //get user choice
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    createJobListing(scanner);
                    break;
                case 2:
                    viewJobListings();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

//create a listing and take the scanner as an input
    private static void createJobListing(Scanner scanner) {
        System.out.print("Enter job title: ");
        String title = scanner.nextLine();

        System.out.print("Enter job description: ");
        String description = scanner.nextLine();

        System.out.print("Enter budget: ");
        double budget = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        // generate a unique ID based on time in millis (this is too simple for practical application use Argon or another hashing method)
        String jobId = "JOB_" + System.currentTimeMillis(); 

        JobListing job = new JobListing(jobId, title, description, budget);
        jobListings.put(jobId, job); 

        System.out.println("Job listing created successfully! ID: " + jobId);
    }

    //print all available job listings 
    private static void viewJobListings() {
        if (jobListings.isEmpty()) {
            System.out.println("No job listings found.");
        } else {
            System.out.println("Available Job Listings:");
            for (String jobId : jobListings.keySet()) {
                JobListing job = jobListings.get(jobId);
                System.out.println("Job ID: " + jobId + ", Title: " + job.getTitle());
            }
        }
    }
}

