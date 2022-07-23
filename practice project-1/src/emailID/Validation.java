package emailID;

import java.util.Scanner;
import java.util.regex.*;

public class Validation {
		private static final String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
	public static void main(String[] args) {
	        String EmailID[]= {"ram@gmail.com","laxman@gmail.com","sita@gmail.com"};
	        System.out.println("Enter Email Id: ");
	        Scanner sc = new Scanner(System.in);
	        String UserEmailID = sc.next();
	        Pattern pattern = Pattern.compile(regex);
	        Matcher match = pattern.matcher(UserEmailID);
	        if(match.matches()) {
	        	System.out.println("the Email ID is "+(match.matches()?"valid":"Invalid"));
	        }
	        for(int i=0;i<EmailID.length;i++) {
	        	if(EmailID[i].equals(UserEmailID))
	        		System.out.println("Email ID is present in the list");
	        	else
	        		System.out.println("user not found");
	        }
	}

}
