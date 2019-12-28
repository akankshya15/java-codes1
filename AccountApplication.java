package akankshya;

public class AccountApplication {

	public static void main(String[] args) {
		Account account= new Account();
		account.setAccountNumber(15011604);
		account.setBalance(5000);
		account.setCustomerName("Akankshya");
		System.out.println(account.getAccountNumber());
		System.out.println(account.getBalance());
		System.out.println(account.getCustomerName());
	}

}
