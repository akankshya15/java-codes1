package akankshya;

public class CustomerApplication {
	public static void main(String[] args){
		/*Customer customer= new Customer();
		customer.setCustomerID(15011604);
		customer.setCustomerName("Akankshya");
		customer.setCustomerCity("Hyderabad");*/
		Customer customer= new Customer(100,"abc","mum");
		Customer customer1 =new Customer();
		System.out.println(customer.getCustomerID());
		System.out.println(customer.getCustomerName());
		System.out.println(customer.getCustomerCity());
		System.out.println(customer1.getCustomerID());
		System.out.println(customer1.getCustomerName());
		System.out.println(customer1.getCustomerCity());
	}
	

}
