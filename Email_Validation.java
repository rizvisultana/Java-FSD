package validationofemail;
import java.util.regex.Pattern;
import java.util.*;


	  class Email_Validation
	{
	    public static boolean isValid(String email)
	    {
	        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
	                            "[a-zA-Z0-9_+&*-]+)*@" +
	                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
	                            "A-Z]{2,7}$";
	                              
	        Pattern pat = Pattern.compile(emailRegex);
	        if (email == null)
	            return false;
	        return pat.matcher(email).matches();
	    }
	  
	    public static void main(String[] args)
	    {
	        ArrayList<String> Emails = new ArrayList<>();
	            
	          Emails.add("rizvikhan2508@gmail.com");
	          Emails.add(".rizvikhan2508@gmail.com");
	          Emails.add("@rizvikhan2508@gmail.com");
	          Emails.add("rizvikhan25@gmail.com");
	          Emails.add("rizvikhan_2508@gmail.com");
	            
	        for(String Email : Emails){
	            if (isValid(Email))
	                System.out.println(Email + " : Email is Valid");
	            else
	                System.out.println(Email + " : Email is InValid");
	        }
	    }
	}

