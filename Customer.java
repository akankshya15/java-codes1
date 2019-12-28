package akankshya;

public class Customer {
	private int customerID;
	private String customerName;
	private String customerCity;
	public Customer(){}
	
	public int getCustomerID() {
		return customerID;
	}
	public Customer(int customerID, String customerName, String customerCity) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerCity = customerCity;
	}//constructor
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	
}
