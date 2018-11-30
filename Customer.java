package adib;

import java.sql.Date;
import java.util.Calendar;

public class Customer implements User {
	
	private String name;
	private String contact;
	private Date customerEnrollmentDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Date getCustomerEnrollmentDate() {
		return customerEnrollmentDate;
	}

	public void setCustomerEnrollmentDate(Date customerEnrollmentDate) {
		this.customerEnrollmentDate = customerEnrollmentDate;
	}

	@Override
	public int discount()
     { 
    	 if(isCustomerEnrolled(contact)) {
    	 Calendar cal=Calendar.getInstance();
    	 cal.set(Calendar.YEAR,cal.get(Calendar.YEAR)-2 );
    	 if(customerEnrollmentDate.getTime()-cal.getTimeInMillis()<0)
    		 return 5;
    	 } 
    		 return 0; 
     }
     
     private boolean isCustomerEnrolled(String contact)
     {
    	 if(this.contact.equals(contact))
    		 return true;
 
    	 return false; 
    	 
    	 
     }
     
}

