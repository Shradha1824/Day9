package day9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAdress {
	// Function to validate the pin code of India.
    public static boolean isValidEmailAddress(String emailAddress)
    {
  
        // Regex to check valid pin code of India.
        String regex = "^[abc_/._xyz]+[@][bridgelabz_/.]+[a-z]{2,3}$";
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
        // If the pin code is empty
        // return false
        if (emailAddress == null) {
            return false;
        }
  
        // Pattern class contains matcher() method
        // to find matching between given pin code
        // and regular expression.
        Matcher m = p.matcher(emailAddress);
        // Return if the pin code
        // matched the ReGex
        return m.matches();
    }   
      
        // Driver Code.
	    public static void main(String args[])
	     {
	  
	        // Test Case 1:
	        String email1 = "abc.xyz@bridgelabz.com";
	        System.out.println(email1 + ": "+ isValidEmailAddress(email1));
	  
	        // Test Case 2:
	        String email2 = "abcxyj@fhjn.com";
	        System.out.println(email2 + ": "+ isValidEmailAddress(email2));

	        // Test Case 3:
	        String email3 = "fghc@.com";
	        System.out.println(email3 + ": "+ isValidEmailAddress(email3));

	        // Test Case 4:
	        String email4 = "400fhjj#hjfg";
	        System.out.println(email4 + ": "+ isValidEmailAddress(email4));
	    }
	}


