package Question;

public class SplitEmailId {

	 public static void main(String[] args) {
	        
	        String email = "anish.gond@gmail.com";

	        // Split the email into parts
	        String[] parts = email.split("@");

	        // Check if the email format is correct
	        if (parts.length == 2) {
	            String username = parts[0];
	            String domain = parts[1];

	            // Print the results
	            System.out.println("Email: " + email);
	            System.out.println("Username: " + username);
	            System.out.println("Domain: " + domain);
	        } else {
	            System.out.println("Invalid email format: " + email);
	        }
	    
	}
	
         

}
