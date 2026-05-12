

//here we will store the records of Employee
public class Employee {
	// Employee attributes
	public String full_name;
	public String email;
	public String contact;
	public String designation;
	public String address;
	public String shift;
	public String data[]; // array to hold employee data
	
	/**
	 * @param nothing
	 * @return void
	 * this method will add employee data
	 */
	
	public void recordEmployeeData() {
		String record[]= {this.full_name, this.email, this.contact, this.designation, this.address, this.shift};
	
		this.data=record;
	}
	
	/**
	 * @param nothing
	 * @return boolean
	 * this method will check if the employee data is available or not
	 */
	public boolean checkEmployeeRecord() {
		boolean status =false;
		if(this.data==null) {
			status=true;
		}
	return status;
	}
	
	/**
	 * @param nothing
	 * @return array
	 * this method will display employee data
	 */
	public void showEmployee() {
		if(this.checkEmployeeRecord()) {
		System.out.println("*********** No record found ***********");
		} else {
			System.out.println("********** Employee Details *********");
			System.out.println("Full Name:" +this.data[0]);
			System.out.println("Email:" +this.data[1]);
			System.out.println("Contact:" +this.data[2]);
			System.out.println("Designation:" +this.data[3]);
			System.out.println("Address:" +this.data[4]);
			System.out.println("Shift:" +this.data[5]);
			System.out.println("****************************");
			
		}
	}
}