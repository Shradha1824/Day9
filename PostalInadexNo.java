package day9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostalInadexNo {
	
		// Function to validate the pin code of India.
	    public static boolean isValidPinCode(String pinCode)
	    {
	  
	        // Regex to check valid pin code of India.
	        String regex = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
	        // Compile the ReGex
	        Pattern p = Pattern.compile(regex);
	        // If the pin code is empty
	        // return false
	        if (pinCode == null) {
	            return false;
	        }
	  
	        // Pattern class contains matcher() method
	        // to find matching between given pin code
	        // and regular expression.
	        Matcher m = p.matcher(pinCode);
	        // Return if the pin code
	        // matched the ReGex
	        return m.matches();
	    }
	  
	   // Driver Code.
	    public static void main(String args[])
	     {
	  
	        // Test Case 1:
	        String num1 = "400088";
	        System.out.println(num1 + ": "+ isValidPinCode(num1));
	  
	        // Test Case 2:
	        String num2 = "A400088";
	        System.out.println(num2 + ": "+ isValidPinCode(num2));
	  
	        // Test Case 3:
	        String num3 = "400088B";
	        System.out.println(num3 + ": "+ isValidPinCode(num3));
	        
	        // Test Case 4:
	        String num4 = "400 088";
	        System.out.println(num4 + ": "+ isValidPinCode(num4));
	    }
	}

