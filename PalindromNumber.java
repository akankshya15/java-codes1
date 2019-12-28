package akankshya;

public class PalindromNumber {

	public static void main(String[] args) {
		String number= args[0];
		System.out.println("the number is:" +args[0]);
		StringBuffer Sb=new StringBuffer();
		Sb.append(number).toString();
		String sb1;
		Sb.reverse();
		if(Sb.equals(Sb1))
			System.out.println("Palindrom number");
		else 
			System.out.println("Not palindrom number");
		
		
	}

}
