package adib;

import java.util.Scanner;

public class Payment {
	
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int disc=0;
	  System.out.println("Enter User Name");
	  String userName=sc.nextLine();
	  System.out.println("Enter Contact Number");
	  String contactNumber=sc.nextLine();
	  Util util=new Util();
	  boolean isEmployeeCustomer=util.isCustomerAnEmployee(contactNumber);
	  if(isEmployeeCustomer) {
		  User user=new Employee();
		    disc= user.discount();	  
	  }
	  
	  boolean isMember=util.isCustomerAMember(contactNumber);
	  if(isMember) {
		  User user=new Member();
		    disc= user.discount();	  
	  }
	  
	  boolean isEnrolled=util.isCustomerAMember(contactNumber);
	  if(isEnrolled) {
		  User user=new Customer();
		    disc= user.discount();	  
	  }
	  	
	  
	  
	  
	  
	  
	  

	  
	}

}
