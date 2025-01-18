package Core_Features;

//this is the job listing class
public class JobListing {
	  private String jobId;
      private String title;
      private String description;
      private double budget;
//initialize constructor
      public JobListing(String jobId, String title, String description, double budget) {
          this.jobId = jobId;
          this.title = title;
          this.description = description;
          this.budget = budget;
      }

	//getter and setter methods below
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
