package akankshya;

public class MutableStrings {

	public static void main(String[] args) {
		StringBuffer sb1= new StringBuffer ();
		sb1.append("Dloitte");
		System.out.println(sb1);
		System.out.print(sb1.length());
		sb1.append("Hyderabad");
		System.out.print(sb1);
		System.out.print(sb1.delete(7, 10));
	
		
		
		

	}

}
