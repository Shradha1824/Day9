
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserResistration {
	 public static void main(String[] args) {

	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter User Name : ");
	      String userName = sc.nextLine();
	      String regex = "^[A-Za-z]+";
	      Pattern pattern = Pattern.compile(regex);
	      Matcher matcher = pattern.matcher(userName);

	      Scanner sc1 = new Scanner(System.in);
	      System.out.println("Enter Phone Number : ");
	      String phoneNo = sc1.nextLine();
	      String regex1 = "[89][0-9]{9}";
	      Pattern pattern1 = Pattern.compile(regex1);
	      Matcher matcher1 = pattern1.matcher(phoneNo);

	      Scanner sc2 = new Scanner(System.in);
	      System.out.println("Enter Passward : ");
	      String passward = sc2.nextLine();
	      String regex2 = "[A-Za-z][@][0-9]";
	      Pattern pattern2 = Pattern.compile(regex2);
	      Matcher matcher2 = pattern2.matcher(passward);

	      if(matcher.matches()) {
		         System.out.println("Given User Name is valid");
		  } 
	      else {
	             System.out.println("Given User Name is not valid");

	      }
	      if(matcher1.matches()) {
		         System.out.println("Given Phone Number is valid");
		  } 
	      else {
		         System.out.println("Given Phone Number is not valid");
	      }

	      if(matcher2.matches()) {
		         System.out.println("Given Passward is valid");
		  } 
	      else {
		         System.out.println("Given Passward is not valid");

	      }

	   }

        }
