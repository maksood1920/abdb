package adib;

public class Employee implements User {
	
	private String empId;
	private String empName;
	private String contact; 
	
	@Override
	public int discount() {
		if(isCustomer(contact))
		     return 30;
		return 0;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	private boolean isCustomer(String contact)
	{
		if(this.contact.equals(contact))
			return true;
		return false;
	}
}
