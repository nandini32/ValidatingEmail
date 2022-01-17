
package PdfAssignmentTwo;

/**
 * @author Nandini_Gorkal
 *
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ValidatingEmail {
	
	
		   public static boolean ValidEmail(String email) {
			   String regex = "^(.+)@(.+)$";
			 //initialize the Pattern object
		       Pattern pattern = Pattern.compile(regex);
		       Matcher matcher = pattern.matcher(email);
		       return matcher.matches();

		       
		   }

		   public static void main(String[] args) {
		       List<String> emails = new ArrayList<String>();
		       // valid email addresses
		       
		       emails.add("nandini@work.com");
		       emails.add("sample@hotmail.com");
		       emails.add("simplilearn@yahoo.me.org");
		       //invalid email addresses
		       emails.add("aman.example.com");
		       emails.add("cultfit@email.com");
		       emails.add("helloworld@.exam.com");
               System.out.println("Entered valid and invalid mail id's are :");
               System.out.println();
		       for (String value : emails) {
		           System.out.println("The Email address " + value + " is " + (ValidEmail(value) ? "valid" : "invalid"));
		       }
		       
		       System.out.println();
		       System.out.println("Enter any email address to check");
		       Scanner sc = new Scanner(System.in);
		       String input = sc.nextLine();
		       System.out.println("The Email address " + input + " is " + (ValidEmail(input) ? "valid" : "invalid"));
		       
		   }
		   
}

