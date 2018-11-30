package adib;

public class Member implements User {
	
	private String memberId;
	private String memberName; 
	private String contactNumber;
	
	@Override
	public int discount() {
		boolean memberFlag=isMember(contactNumber);
		if(memberFlag)
			return 10;
		return 0;
	}
	
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	private boolean isMember(String contactNumber) {
		
		// if the contact number exists in the db then 
		if(this.contactNumber.equals(contactNumber))
			return true;
		return false;
	}

}
