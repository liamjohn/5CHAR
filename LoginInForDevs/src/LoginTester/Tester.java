package LoginTester;

import java.util.Scanner;

public class Tester 
{
	   public static void main(String [] args)
	   {
		/*tester class that takes in the user
		* input and compares it to the already established usernames
		*and passwords.
		*loops until right credentials are entered*/	   
	         @SuppressWarnings("resource")

			Scanner keyboardIn = new Scanner(System.in);
	         Login lg = new Login();
	         System.out.println("Hello User");
	         do
	         {
	            lg.introduction();
	            lg.accDetails(keyboardIn.nextLine());
	            lg.password(keyboardIn.nextLine());
	            lg.confirm();
	         }while(lg.check !=true);	         
	   }
}
