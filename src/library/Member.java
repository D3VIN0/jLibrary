package library;

class Member {
	private int memID;
	private String memName;
	private String memSurname;
	private String memAddress;
	private int contactNumber;

	/* Constructor*/
	Member(String n,String s,String add,int contact,int id)
	{
		setMemName(n);
		setMemSurname(s);
		setMemAddress(add);
		setContactNumber(contact);
		setMemID(id);
	}
	
	/*Functions*/
	String getAllInfo()	//getting all info of member
	{
		return  "\nID: " + getMemID()
				+ "\tName: " + getMemName()
				+ "\tSurname: " + getMemSurname()
				+ "\tAddress: " + getmemAddress()
				+ "\tPhone: " + getContactNumber();
	}
	
	/**
	 * @return the memID
	 */
	 int getMemID() {
		return memID;
	}

	/**
	 * @param memID the memID to set
	 */
	private void setMemID(int memID) {
		this.memID = memID;
	}

	/**
	 * @return the memName
	 */
	private String getMemName() {
		return memName;
	}

	/**
	 * @param memName the memName to set
	 */
	private void setMemName(String memName) {
		this.memName = memName;
	}

	/**
	 * @return the memSurname
	 */
	private String getMemSurname() {
		return memSurname;
	}

	/**
	 * @param memSurname the memSurname to set
	 */
	private void setMemSurname(String memSurname) {
		this.memSurname = memSurname;
	}

	/**
	 * @return the address
	 */
	private String getmemAddress() {
		return memAddress;
	}

	/**
	 * @param address the address to set
	 */
	private void setMemAddress(String address) {
		this.memAddress = address;
	}

	/**
	 * @return the contactNumber
	 */
	private int getContactNumber() {
		return contactNumber;
	}

	/**
	 * @param contactNumber the contactNumber to set
	 */
	private void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	

}
