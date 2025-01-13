package Core_Features;

public class JobListing {
	  private String jobId;
      private String title;
      private String description;
      private double budget;

      public JobListing(String jobId, String title, String description, double budget) {
          this.jobId = jobId;
          this.title = title;
          this.description = description;
          this.budget = budget;
      }

      public String getJobId() {
          return jobId;
      }

      public String getTitle() {
          return title;
      }

      public String getDescription() {
          return description;
      }

      public double getBudget() {
          return budget;
      }
  
}
