package adib;

import java.util.ArrayList;
import java.util.List;

public class Util {

private List<String> customerList;
private List<String> memberList;
private List<String> employeeList;

 boolean isCustomerEnrolled(String contact)
 {
    	 if(this.customerList.contains(contact))
    		 return true;
    	 return false; 	 
 }
 
  boolean  isCustomerAnEmployee(String contact)
 {
	 if(this.employeeList.contains(contact))
		 return true;
	 return false; 	 	 
 }
 
 boolean isCustomerAMember(String contact)
 {
	 if(this.memberList.contains(contact))
		 return true;
	 return false; 	 
	 
 }
     
public void loadDummyValues() {
	// TODO Auto-generated method stub
	customerList=new ArrayList<String>();
	customerList.add("9000000000");
	customerList.add("9000000001");
	customerList.add("9000000002");
	
	memberList=new ArrayList<String>();
	memberList.add("8000000000");
	memberList.add("8000000001");
	memberList.add("8000000002");
	
	employeeList=new ArrayList<String>();
	employeeList.add("7000000000");
	employeeList.add("7000000001");
	employeeList.add("7000000002");
	
	

}

}
